/**
 * 
 */
package com.codejourney.core;

/**
 * 231. Power of Two
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
public class PowerOfTwo_231 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("V1");
		System.out.println("1 = "+PowerOfTwo_231.isPowerOfTwo_231V1(1));
		System.out.println("2 = "+PowerOfTwo_231.isPowerOfTwo_231V1(2));
		System.out.println("3 = "+PowerOfTwo_231.isPowerOfTwo_231V1(3));
		System.out.println("6 = "+PowerOfTwo_231.isPowerOfTwo_231V1(6));
		System.out.println("16 = "+PowerOfTwo_231.isPowerOfTwo_231V1(16));
		System.out.println("20 = "+PowerOfTwo_231.isPowerOfTwo_231V1(20));
		
		// V2
		System.out.println("V2");
		System.out.println("1 = "+PowerOfTwo_231.isPowerOfTwo_231V2(1));
		System.out.println("2 = "+PowerOfTwo_231.isPowerOfTwo_231V2(2));
		System.out.println("3 = "+PowerOfTwo_231.isPowerOfTwo_231V2(3));
		System.out.println("6 = "+PowerOfTwo_231.isPowerOfTwo_231V2(6));
		System.out.println("16 = "+PowerOfTwo_231.isPowerOfTwo_231V2(16));
		System.out.println("20 = "+PowerOfTwo_231.isPowerOfTwo_231V2(20));
		
		// V3
		System.out.println("V3");
		System.out.println("1 = "+PowerOfTwo_231.isPowerOfTwo_231V3(1));
		System.out.println("2 = "+PowerOfTwo_231.isPowerOfTwo_231V3(2));
		System.out.println("3 = "+PowerOfTwo_231.isPowerOfTwo_231V3(3));
		System.out.println("6 = "+PowerOfTwo_231.isPowerOfTwo_231V3(6));
		System.out.println("16 = "+PowerOfTwo_231.isPowerOfTwo_231V3(16));
		System.out.println("20 = "+PowerOfTwo_231.isPowerOfTwo_231V3(20));
		
		//V4
		System.out.println("V4");
		System.out.println("1 = "+PowerOfTwo_231.isPowerOfTwo_231V4(1));
		System.out.println("2 = "+PowerOfTwo_231.isPowerOfTwo_231V4(2));
		System.out.println("3 = "+PowerOfTwo_231.isPowerOfTwo_231V4(3));
		System.out.println("6 = "+PowerOfTwo_231.isPowerOfTwo_231V4(6));
		System.out.println("16 = "+PowerOfTwo_231.isPowerOfTwo_231V4(16));
		System.out.println("20 = "+PowerOfTwo_231.isPowerOfTwo_231V4(20));
		
		// V5
		System.out.println("V5");
		System.out.println("1 = "+PowerOfTwo_231.isPowerOfTwo_231V5(1));
		System.out.println("2 = "+PowerOfTwo_231.isPowerOfTwo_231V5(2));
		System.out.println("3 = "+PowerOfTwo_231.isPowerOfTwo_231V5(3));
		System.out.println("6 = "+PowerOfTwo_231.isPowerOfTwo_231V5(6));
		System.out.println("16 = "+PowerOfTwo_231.isPowerOfTwo_231V5(16));
		System.out.println("20 = "+PowerOfTwo_231.isPowerOfTwo_231V5(20));
		
	}

	public static boolean isPowerOfTwo_231V1(int n) {
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
	
	public static boolean isPowerOfTwo_231V2(int n) {
	    if (n < 1) return false;

	    while (n % 2 == 0) {
	        n /= 2;
	    }
	    return n == 1;
	}
	
	public static boolean isPowerOfTwo_231V3(int n) {
	    return n > 0 && (n & (n - 1)) == 0;
	}
	
	public static boolean isPowerOfTwo_231V4(int n) {
	    return n > 0 && Integer.bitCount(n) == 1;
	}
	
	public static boolean isPowerOfTwo_231V5(int n) {
	    return n > 0 && Integer.highestOneBit(n) == n;
	}




}
