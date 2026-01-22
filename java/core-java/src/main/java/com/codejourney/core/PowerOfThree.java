/**
 * 
 */
package com.codejourney.core;

/**
 * 
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
