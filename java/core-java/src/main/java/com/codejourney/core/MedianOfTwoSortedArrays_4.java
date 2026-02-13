/**
 * 
 */
package com.codejourney.core;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * 
 * 4. Median of Two Sorted Arrays
Solved
Hard
Topics
premium lock icon
Companies
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
 */
public class MedianOfTwoSortedArrays_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums1 = new int[] { 1, 2 };
		int[] nums2 = new int[] { 3 };
		System.out.println(findMedianSortedArraysV2(nums1, nums2));
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		double returnVal = 0;
		for(int a: nums1) {
			arrayList.add(a);
		}
		
		for(int a: nums2) {
			arrayList.add(a);
		}
		
		Collections.sort(arrayList);
		
		int totalSize = arrayList.size();
		if(totalSize%2 == 0) {
			int secondIndex = totalSize/2;
			int firstIndex = secondIndex - 1;
			returnVal =  (arrayList.get(firstIndex) + arrayList.get(secondIndex))/2.0d; 
		} else {
			returnVal = arrayList.get(totalSize/2);
		}
		return returnVal;
	}
	
	public static double findMedianSortedArraysV2(int[] nums1, int[] nums2) {

	    int m = nums1.length;
	    int n = nums2.length;
	    int total = m + n;

	    int i = 0, j = 0;
	    int prev = 0, curr = 0;

	    for (int count = 0; count <= total / 2; count++) {
	        prev = curr;

	        if (i < m && (j >= n || nums1[i] <= nums2[j])) {
	            curr = nums1[i++];
	        } else {
	            curr = nums2[j++];
	        }
	    }

	    if (total % 2 == 0) {
	        return (prev + curr) / 2.0;
	    } else {
	        return curr;
	    }
	}


}
