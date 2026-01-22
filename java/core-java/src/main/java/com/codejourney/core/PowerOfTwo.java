/**
 * 
 */
package com.codejourney.core;

/**
 * POWER OF TWO
 Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.

 

Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:

Input: n = 3
Output: false
 

Constraints:

-231 <= n <= 231 - 1
 */
public class PowerOfTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("V1");
		System.out.println("1 = "+PowerOfTwo.isPowerOfTwoV1(1));
		System.out.println("2 = "+PowerOfTwo.isPowerOfTwoV1(2));
		System.out.println("3 = "+PowerOfTwo.isPowerOfTwoV1(3));
		System.out.println("6 = "+PowerOfTwo.isPowerOfTwoV1(6));
		System.out.println("16 = "+PowerOfTwo.isPowerOfTwoV1(16));
		System.out.println("20 = "+PowerOfTwo.isPowerOfTwoV1(20));
		
		// V2
		System.out.println("V2");
		System.out.println("1 = "+PowerOfTwo.isPowerOfTwoV2(1));
		System.out.println("2 = "+PowerOfTwo.isPowerOfTwoV2(2));
		System.out.println("3 = "+PowerOfTwo.isPowerOfTwoV2(3));
		System.out.println("6 = "+PowerOfTwo.isPowerOfTwoV2(6));
		System.out.println("16 = "+PowerOfTwo.isPowerOfTwoV2(16));
		System.out.println("20 = "+PowerOfTwo.isPowerOfTwoV2(20));
		
		// V3
		System.out.println("V3");
		System.out.println("1 = "+PowerOfTwo.isPowerOfTwoV3(1));
		System.out.println("2 = "+PowerOfTwo.isPowerOfTwoV3(2));
		System.out.println("3 = "+PowerOfTwo.isPowerOfTwoV3(3));
		System.out.println("6 = "+PowerOfTwo.isPowerOfTwoV3(6));
		System.out.println("16 = "+PowerOfTwo.isPowerOfTwoV3(16));
		System.out.println("20 = "+PowerOfTwo.isPowerOfTwoV3(20));
		
		//V4
		System.out.println("V4");
		System.out.println("1 = "+PowerOfTwo.isPowerOfTwoV4(1));
		System.out.println("2 = "+PowerOfTwo.isPowerOfTwoV4(2));
		System.out.println("3 = "+PowerOfTwo.isPowerOfTwoV4(3));
		System.out.println("6 = "+PowerOfTwo.isPowerOfTwoV4(6));
		System.out.println("16 = "+PowerOfTwo.isPowerOfTwoV4(16));
		System.out.println("20 = "+PowerOfTwo.isPowerOfTwoV4(20));
		
		// V5
		System.out.println("V5");
		System.out.println("1 = "+PowerOfTwo.isPowerOfTwoV5(1));
		System.out.println("2 = "+PowerOfTwo.isPowerOfTwoV5(2));
		System.out.println("3 = "+PowerOfTwo.isPowerOfTwoV5(3));
		System.out.println("6 = "+PowerOfTwo.isPowerOfTwoV5(6));
		System.out.println("16 = "+PowerOfTwo.isPowerOfTwoV5(16));
		System.out.println("20 = "+PowerOfTwo.isPowerOfTwoV5(20));
		
	}

	public static boolean isPowerOfTwoV1(int n) {
		if(n<1) {
			return false;
		} else if(n == 1) {
			return true; 
		} else {
			while(n%2==0) {
				n /= 2;
			}
			if(n == 1) {
				return true;
			} else {
				return false;
			}
		}
    }
	
	public static boolean isPowerOfTwoV2(int n) {
	    if (n < 1) return false;

	    while (n % 2 == 0) {
	        n /= 2;
	    }
	    return n == 1;
	}
	
	public static boolean isPowerOfTwoV3(int n) {
	    return n > 0 && (n & (n - 1)) == 0;
	}
	
	public static boolean isPowerOfTwoV4(int n) {
	    return n > 0 && Integer.bitCount(n) == 1;
	}
	
	public static boolean isPowerOfTwoV5(int n) {
	    return n > 0 && Integer.highestOneBit(n) == n;
	}




}
