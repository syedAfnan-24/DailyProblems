package leetCode.DataStructures.MergeSortedArray;

import java.util.Arrays;
//problem 88 day 2
public class Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
    }
}
