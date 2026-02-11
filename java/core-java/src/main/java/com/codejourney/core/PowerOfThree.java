/**
 * 
 */
package com.codejourney.core;

/**
 * 
 * 326. Power of Three
Easy
Topics
premium lock icon
Companies
Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.

 

Example 1:

Input: n = 27
Output: true
Explanation: 27 = 33
Example 2:

Input: n = 0
Output: false
Explanation: There is no x where 3x = 0.
Example 3:

Input: n = -1
Output: false
Explanation: There is no x where 3x = (-1).
 

Constraints:

-231 <= n <= 231 - 1
 

Follow up: Could you solve it without loops/recursion?
 */
public class PowerOfThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// V1
		System.out.println("V1 1 - " + PowerOfThree.isPowerOfThreeV1(1));
		System.out.println("V1 3 - " + PowerOfThree.isPowerOfThreeV1(3));
		System.out.println("V1 9 - " + PowerOfThree.isPowerOfThreeV1(9));
		System.out.println("V1 10 - " + PowerOfThree.isPowerOfThreeV1(10));
		System.out.println("V1 15 - " + PowerOfThree.isPowerOfThreeV1(15));

	}

	public static boolean isPowerOfThreeV1(int n) {
		if (n < 1) {
			return false;
		} else if (n == 1) {
			return true;
		} else {
			while (n % 3 == 0) {
				n /= 3;
			}
			return n == 1;
		}
	}

	/**
	 * @param n
	 * @return The largest power of 3 that fits in a 32-bit int is divisible by all
	 *         smaller powers of 3. If n = 3^k
	 * 
	 *         Then 3^19 % 3^k == 0
	 * 
	 *         If n has any other prime factor, modulo ≠ 0
	 */
	public static boolean isPowerOfThree(int n) {
		return n > 0 && 1162261467 % n == 0;
	}

}
