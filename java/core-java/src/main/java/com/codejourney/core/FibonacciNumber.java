/**
 * 
 */
package com.codejourney.core;

/**
 * 509. Fibonacci Number
Easy
Topics
premium lock icon
Companies
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).

 

Example 1:

Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
Example 2:

Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
Example 3:

Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 

Constraints:

0 <= n <= 30
 */
public class FibonacciNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("0 " + FibonacciNumber.fib(0));
		System.out.println("1 " + FibonacciNumber.fib(1));
		System.out.println("2 " + FibonacciNumber.fib(2));
		System.out.println("3 " + FibonacciNumber.fib(3));
		System.out.println("4 " + FibonacciNumber.fib(4));
		System.out.println("5 " + FibonacciNumber.fib(5));
		System.out.println("6 " + FibonacciNumber.fib(6));
		System.out.println("7 " + FibonacciNumber.fib(7));
		FibonacciNumber.printFibSeries(10);

		// checkTheNumberIsFibV1
		System.out.println("0 - " + checkTheNumberIsFibV1(0));
		System.out.println("1 - " + checkTheNumberIsFibV1(1));
		System.out.println("2 - " + checkTheNumberIsFibV1(2));
		System.out.println("3 - " + checkTheNumberIsFibV1(3));
		System.out.println("4 - " + checkTheNumberIsFibV1(4));
	}

	/**
	 * @param n
	 * @return
	 */
	public static int fib(int n) {
		int firstNumb = 0;
		int secondNumb = 1;
		int finalNumb = 0;
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else {
			while (n >= 2) {
				finalNumb = firstNumb + secondNumb;
				firstNumb = secondNumb;
				secondNumb = finalNumb;
				n--;
			}
		}
		return finalNumb;
	}

	/**
	 * @param n
	 * @return
	 */
	int fibV2(int n) {
		if (n <= 1)
			return n;
		return fibV2(n - 1) + fibV2(n - 2);
	}

	/**
	 * @param n
	 * @param dp
	 * @return
	 */
	int fibV3(int n, int[] dp) {
		if (n <= 1)
			return n;
		if (dp[n] != 0)
			return dp[n];
		return dp[n] = fibV3(n - 1, dp) + fibV3(n - 2, dp);
	}

	/**
	 * @param n
	 */
	public static void printFibSeries(int n) {
		if (n == 0)
			System.out.println("0");
		else if (n == 1)
			System.out.println("1");
		else {
			String str = "0 1";
			int firstNumber = 0;
			int secondNumber = 1;
			int finalNumber = 0;
			while (n >= 2) {
				finalNumber = firstNumber + secondNumber;
				str += " " + finalNumber;
				firstNumber = secondNumber;
				secondNumber = finalNumber;
				n--;
			}
			System.out.println(str);
		}
	}

	/**
	 * @param n
	 * @return
	 */
	public static boolean checkTheNumberIsFibV1(int n) {
		if (n < 0)
			return false;
		else if (n == 0 || n == 1)
			return true;
		else {
			int firstNumber = 0;
			int secondNumber = 1;
			int finalNumber = 0;
			while (n > finalNumber) {
				finalNumber = firstNumber + secondNumber;
				firstNumber = secondNumber;
				secondNumber = finalNumber;
			}
			return n == finalNumber;
		}
	}

}
