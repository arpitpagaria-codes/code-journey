/**
 * 
 */
package com.codejourney.core;

/**
 * 747. Largest Number At Least Twice of Others Easy Topics premium lock icon
 * Companies Hint You are given an integer array nums where the largest integer
 * is unique.
 * 
 * Determine whether the largest element in the array is at least twice as much
 * as every other number in the array. If it is, return the index of the largest
 * element, or return -1 otherwise.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [3,6,1,0] Output: 1 Explanation: 6 is the largest integer. For
 * every other number in the array x, 6 is at least twice as big as x. The index
 * of value 6 is 1, so we return 1. Example 2:
 * 
 * Input: nums = [1,2,3,4] Output: -1 Explanation: 4 is less than twice the
 * value of 3, so we return -1.
 * 
 * 
 * Constraints:
 * 
 * 2 <= nums.length <= 50 0 <= nums[i] <= 100 The largest element in nums is
 * unique.
 */
public class LargestNumberAtLeastTwiceofOthers_747 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[] {3,6,0,1};
		System.out.println(dominantIndexV1(nums));

	}

	public static int dominantIndexV1(int[] nums) {
		int returnVal = -1;
		int largestNum = 0;
		int largePos = 0;
		for(int a:nums) {
			if(largestNum < a) {
				largestNum = a;
				returnVal = largePos;
			}
			largePos++;
		}
		
		for(int a:nums) {
			if(a!=largestNum) {
				if(a*2 > largestNum) {
					returnVal = -1;
					break;
				}
			}
		}
		
		return returnVal;
	}
	
	public static int dominantIndexV2(int[] nums) {
	    int max = -1, secondMax = -1, index = -1;

	    for (int i = 0; i < nums.length; i++) {
	        if (nums[i] > max) {
	            secondMax = max;
	            max = nums[i];
	            index = i;
	        } else if (nums[i] > secondMax) {
	            secondMax = nums[i];
	        }
	    }

	    return max >= 2 * secondMax ? index : -1;
	}
}
