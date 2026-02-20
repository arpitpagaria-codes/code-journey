/**
 * 
 */
package com.codejourney.core;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 977. Squares of a Sorted Array Easy Topics premium lock icon Companies Given
 * an integer array nums sorted in non-decreasing order, return an array of the
 * squares of each number sorted in non-decreasing order.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [-4,-1,0,3,10] Output: [0,1,9,16,100] Explanation: After
 * squaring, the array becomes [16,1,0,9,100]. After sorting, it becomes
 * [0,1,9,16,100]. Example 2:
 * 
 * Input: nums = [-7,-3,2,3,11] Output: [4,9,9,49,121]
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 104 -104 <= nums[i] <= 104 nums is sorted in
 * non-decreasing order.
 * 
 * 
 * Follow up: Squaring each element and sorting the new array is very trivial,
 * could you find an O(n) solution using a different approach?
 */
public class SquaresOfASortedArray_977 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[] { -4, -1, 0, 3, 10 };
		System.out.println(Arrays.toString(sortedSquaresV2(nums)));

	}

	public static int[] sortedSquaresV1(int[] nums) {
		int[] returnArray = new int[nums.length];
		int i = 0;
		for (int a : nums) {
			returnArray[i] = a * a;
			i++;
		}
		Arrays.sort(returnArray);
		return returnArray;
	}
	
	public static int[] sortedSquaresV2(int[] nums) {
		 int n = nums.length;
		    int[] result = new int[n];
		    
		    int left = 0;
		    int right = n - 1;
		    int index = n - 1;
		    
		    while (left <= right) {
		        int leftSquare = nums[left] * nums[left];
		        int rightSquare = nums[right] * nums[right];
		        
		        if (leftSquare > rightSquare) {
		            result[index] = leftSquare;
		            left++;
		        } else {
		            result[index] = rightSquare;
		            right--;
		        }
		        index--;
		    }
		    
		    return result;
	}
}
