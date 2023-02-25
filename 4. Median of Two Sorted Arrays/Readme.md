# Problem: Median of Two Sorted Arrays

Platform: Leetcode

Difficulty: Hard

Problem Link: https://leetcode.com/problems/median-of-two-sorted-arrays/

## Problem Statement:

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

Example 1:

    Input: nums1 = [1,3], nums2 = [2]
    Output: 2.00000
    Explanation: merged array = [1,2,3] and median is 2.

## Solution (In Java):

    class Solution {
        public static double findMedian(int a[], int n)
        {
            // First we sort the array
            Arrays.sort(a);
    
            // check for even case
            if (n % 2 != 0)
                return (double)a[n / 2];
    
            return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
        }
        public double findMedianSortedArrays(int[] a, int[] b) {
            int n = a.length;
            int m = b.length;
            int[] c = new int[n + m];
    
            // Merge two array into one array
            System.arraycopy(a, 0, c, 0, n);
            System.arraycopy(b, 0, c, n, m);
    
            // Sort the merged array
            Arrays.sort(c);
            return(findMedian(c,n+m));
        }
    }





