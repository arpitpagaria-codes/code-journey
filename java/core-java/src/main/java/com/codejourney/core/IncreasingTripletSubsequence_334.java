/**
 * 
 */
package com.codejourney.core;

/**
 * 334. Increasing Triplet Subsequence Medium Topics premium lock icon Companies
 * Given an integer array nums, return true if there exists a triple of indices
 * (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such
 * indices exists, return false.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,4,5] Output: true Explanation: Any triplet where i < j <
 * k is valid. Example 2:
 * 
 * Input: nums = [5,4,3,2,1] Output: false Explanation: No triplet exists.
 * Example 3:
 * 
 * Input: nums = [2,1,5,0,4,6] Output: true Explanation: One of the valid
 * triplet is (1, 4, 5), because nums[1] == 1 < nums[4] == 4 < nums[5] == 6.
 */
public class IncreasingTripletSubsequence_334 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[] { 0,4,1,3 };
		System.out.println(increasingTriplet(nums));
	}

	/**
	 * @param nums
	 * @return
	 */
	public static boolean increasingTriplet(int[] nums) {
		int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num; // smallest so far
            } else if (num <= second) {
                second = num; // second smallest
            } else {
                return true; // found third > first and second
            }
        }
        return false;
	}

}
