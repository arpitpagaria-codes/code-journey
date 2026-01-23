/**
 * 
 */
package com.codejourney.core;

/**
 * 
 */
public class TribonacciNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("0 - " + tribonacci(0));
		System.out.println("1 - " + tribonacci(1));
		System.out.println("2 - " + tribonacci(2));
		System.out.println("3 - " + tribonacci(3));
		System.out.println("4 - " + tribonacci(4));
		System.out.println("5 - " + tribonacci(5));
		System.out.println("25 - " + tribonacci(25));

	}

	public static int tribonacci(int n) {
		if (n <= 0)
			return 0;
		else if (n == 1 || n == 2)
			return 1;
		else {
			int a = 0, b = 1, c = 1, d = 0;
			while (n >= 3) {
				d = a + b + c;
				a = b;
				b = c;
				c = d;
				n--;
			}
			return c;
		}

	}

	public static int tribonacciV2(int n) {
		if (n <= 0)
			return 0;
		else if (n == 1 || n == 2)
			return 1;
		else {
			int a = 0, b = 1, c = 1;
			for (int i = 3; i <= n; i++) {
				int d = a + b + c;
				a = b;
				b = c;
				c = d;
			}
			return c;
		}

	}

}
