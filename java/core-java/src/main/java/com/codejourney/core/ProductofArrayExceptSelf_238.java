/**
 * 
 */
package com.codejourney.core;

import java.util.Arrays;

/**
 * 238. Product of Array Except Self Medium Topics premium lock icon Companies
 * Hint Given an integer array nums, return an array answer such that answer[i]
 * is equal to the product of all the elements of nums except nums[i].
 * 
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit
 * integer.
 * 
 * You must write an algorithm that runs in O(n) time and without using the
 * division operation.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,4] Output: [24,12,8,6] Example 2:
 * 
 * Input: nums = [-1,1,0,-3,3] Output: [0,0,9,0,0]
 * 
 * 
 * Constraints:
 * 
 * 2 <= nums.length <= 105 -30 <= nums[i] <= 30 The input is generated such that
 * answer[i] is guaranteed to fit in a 32-bit integer.
 */
public class ProductofArrayExceptSelf_238 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = { 1,2,3,4 };
		System.out.println(Arrays.toString(productExceptSelf(nums)));
	}

	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
	    int[] result = new int[n];

	    // Step 1: store prefix product
	    result[0] = 1;
	    for(int i = 1; i < n; i++){
	        result[i] = result[i-1] * nums[i-1];
	    }

	    // Step 2: multiply suffix product
	    int suffix = 1;

	    for(int i = n-1; i >= 0; i--){
	        result[i] = result[i] * suffix;
	        suffix = suffix * nums[i];
	    }

	    return result;

	}

}
