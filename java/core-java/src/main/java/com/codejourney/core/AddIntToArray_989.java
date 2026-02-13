/**
 * 
 */
package com.codejourney.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 989. Add to Array-Form of Integer Easy Topics premium lock icon Companies The
 * array-form of an integer num is an array representing its digits in left to
 * right order.
 * 
 * For example, for num = 1321, the array form is [1,3,2,1]. Given num, the
 * array-form of an integer, and an integer k, return the array-form of the
 * integer num + k.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: num = [1,2,0,0], k = 34 Output: [1,2,3,4] Explanation: 1200 + 34 =
 * 1234 Example 2:
 * 
 * Input: num = [2,7,4], k = 181 Output: [4,5,5] Explanation: 274 + 181 = 455
 * Example 3:
 * 
 * Input: num = [2,1,5], k = 806 Output: [1,0,2,1] Explanation: 215 + 806 = 1021
 * 
 * 
 * Constraints:
 * 
 * 1 <= num.length <= 104 0 <= num[i] <= 9 num does not contain any leading
 * zeros except for the zero itself. 1 <= k <= 104
 */
public class AddIntToArray_989 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = new int[] { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
		System.out.println(addToArrayForm(a, 1));
		int[] b = new int[] { 1 };
		System.out.println(addToArrayForm(b, 9999));
		int[] c = new int[] { 0 };
		System.out.println(addToArrayForm(c, 0));
	}

	
	public static List<Integer> addToArrayFormV2(int[] num, int k) {

		if (num == null) {
	        num = new int[0];      // treat null as empty array
	    }
		
	    List<Integer> result = new ArrayList<>();

	    int i = num.length - 1;
	    int carry = 0;

	    while (i >= 0 || k > 0 || carry > 0) {

	        int arrayDigit = (i >= 0) ? num[i] : 0;
	        int lastDigit = k % 10;

	        int sum = arrayDigit + lastDigit + carry;

	        carry = sum / 10;

	        result.add(sum % 10);

	        k = k / 10;
	        i--;
	    }

	    Collections.reverse(result);
	    return result;
	}

	public static List<Integer> addToArrayForm(int[] num, int k) {
		int numLength = num.length;
		List<Integer> result = new ArrayList<>(numLength);
		int carry = 0;
		int l = 0;
		while (k > 9 && numLength > 0) {
			numLength--;
			int lastDigit = k % 10;
			k = k / 10;
			int arrayDigit = num[numLength];
			int addDigit = lastDigit + arrayDigit + carry;
			if (addDigit > 9) {
				carry = addDigit / 10;
			} else {
				carry = 0;
			}
			result.add(l, (addDigit % 10));
			l++;
		}
		if (numLength != 0) {
			for (int i = numLength - 1; i >= 0; i--) {
				int arrayDigit = num[i];
				int addDigit = k + arrayDigit + carry;
				if (addDigit > 9) {
					carry = addDigit / 10;
				} else {
					carry = 0;
				}
				result.add(l, (addDigit % 10));
				l++;
				k = 0;
			}
			if (carry != 0) {
				result.add(l, carry);
			}
		} else {
			while (k > 9) {
				int addDigit = (k%10) + carry;
				if (addDigit > 9) {
					carry = addDigit / 10;
				} else {
					carry = 0;
				}
				result.add(l, (addDigit % 10));
				k=k/10;
				l++;
			}
			int addDigit = k + carry;
			if (addDigit > 9) {
				carry = addDigit / 10;
				result.add(l, addDigit%10);
				l++;
				result.add(l, carry);
			} else {
				carry = 0;
				result.add(l, addDigit%10);
			}

			
		}
		Collections.reverse(result);
		return result;
	}

}
