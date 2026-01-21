/**
 * 
 */
package com.codejourney.core;

/**
 * 
 */
public class PalindromeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(PalindromeNumber.isPalindromeV4(121));
		System.out.println(PalindromeNumber.isPalindromeV4(-121));
		System.out.println(PalindromeNumber.isPalindromeV4(010));

	}
	
	public static boolean isPalindrome(int x) {
		String ints = Integer.toString(x);
		String intr="";
		for(int i=ints.length()-1;i>=0;i--) {
			intr+= ints.charAt(i);
		}
		if(ints.equals(intr)) {
			return true;
		}
        return false;
    }
	
	public static boolean isPalindromeV2(int x) {
		String ints = Integer.toString(x);
		String intr = new StringBuilder(ints).reverse().toString();
		return ints.equals(intr);
	}
	
	public static boolean isPalindromeV3(int x) {
	    String s = Integer.toString(x);
	    int left = 0, right = s.length() - 1;

	    while (left < right) {
	        if (s.charAt(left) != s.charAt(right)) {
	            return false;
	        }
	        left++;
	        right--;
	    }
	    return true;
	}

	public static boolean isPalindromeV4(int x) {
	    if (x < 0 || (x % 10 == 0 && x != 0)) {
	        return false;
	    }

	    int reversedHalf = 0;

	    while (x > reversedHalf) {
	        reversedHalf = reversedHalf * 10 + x % 10;
	        x /= 10;
	    }

	    return x == reversedHalf || x == reversedHalf / 10;
	}

}
