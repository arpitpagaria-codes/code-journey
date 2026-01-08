package com.codejourney.core;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;

public class WriteFileInNotepadPP {
    public static void main(String[] args) {
        try {
        	// Record start time before typing
        	long startTime = System.currentTimeMillis();
            Robot robot = new Robot();

            // Give yourself 2 seconds to switch focus to desktop
            System.out.println("Switch to Desktop quickly! Opening in 2 seconds...");
            Thread.sleep(2000);

            // Press Windows Key (open start/search)
            robot.keyPress(KeyEvent.VK_WINDOWS);
            robot.keyRelease(KeyEvent.VK_WINDOWS);
            Thread.sleep(800);

            // Type "notepad"
            typeWord(robot, "notepad");
            Thread.sleep(300);

            // Type "++"
            typePlus(robot);
            typePlus(robot);

            Thread.sleep(1000);

            // Press ENTER → open Notepad++
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            System.out.println("Notepad++ should open now!");
            Thread.sleep(3000); // wait for Notepad++ to open

            // Press CTRL+N → new tab
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_N);
            robot.keyRelease(KeyEvent.VK_N);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(1000);

            // Read a file and type its content
            String filePath = "D:\\Arpit\\Tech\\AI\\transcript_Youtube_video.txt"; // change path
            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                int ch;
                while ((ch = br.read()) != -1) {
                    typeChar(robot, (char) ch);
                    Thread.sleep(500);
                 // Calculate elapsed time in milliseconds
                    long elapsed = System.currentTimeMillis() - startTime;
                    //System.out.println(elapsed);
                    if (elapsed > (4 * 60 * 10000)) {
                        // After 4 minutes → slow
                        Thread.sleep(500);  
                    }
                }
            }

            System.out.println("File content typed into Notepad++!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // helper method to type normal words
    private static void typeWord(Robot robot, String word) {
        for (char c : word.toCharArray()) {
            typeChar(robot, c);
        }
    }

    // helper method to type a single char
    private static void typeChar(Robot robot, char c) {
        try {
            boolean upperCase = Character.isUpperCase(c);
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

            if (keyCode == KeyEvent.VK_UNDEFINED) {
                // handle special cases
                if (c == '+') {
                    typePlus(robot);
                } else if (c == '\n') {
                    robot.keyPress(KeyEvent.VK_ENTER);
                    robot.keyRelease(KeyEvent.VK_ENTER);
                } else if (c == '\t') {
                    robot.keyPress(KeyEvent.VK_TAB);
                    robot.keyRelease(KeyEvent.VK_TAB);
                }
                return;
            }

            if (upperCase) robot.keyPress(KeyEvent.VK_SHIFT);

            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);

            if (upperCase) robot.keyRelease(KeyEvent.VK_SHIFT);

            Thread.sleep(30); // typing delay
        } catch (Exception ignored) {}
    }

    // helper method to type '+'
    private static void typePlus(Robot robot) {
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_EQUALS);   // SHIFT + '=' → '+'
        robot.keyRelease(KeyEvent.VK_EQUALS);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        try { Thread.sleep(30); } catch (InterruptedException ignored) {}
    }
}
