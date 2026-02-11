/**
 * 
 */
package com.codejourney.core;

/**
 * 9. Palindrome Number
 Given an integer x, return true if x is a palindrome, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1
 

Follow up: Could you solve it without converting the integer to a string?
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
