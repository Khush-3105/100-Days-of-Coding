# Problem: Trapping Rain Water

Platform: Leetcode

Difficulty: Hard

Problem Link: https://leetcode.com/problems/trapping-rain-water/

## Problem Statement:

Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

Example 1:

    Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
    Output: 6
    Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

## Solution (In Java):

    class Solution {
        public int trap(int[] arr) {
            int res = 0;
    
            // For every element of the array
            // except first and last element
            for (int i = 1; i < arr.length - 1; i++) {
    
                // Find maximum element on its left
                int left = arr[i];
                for (int j = 0; j < i; j++) {
                    left = Math.max(left, arr[j]);
                }
    
                // Find maximum element on its right
                int right = arr[i];
                for (int j = i + 1; j < arr.length; j++) {
                    right = Math.max(right, arr[j]);
                }
    
                // Update maximum water value
                res += Math.min(left, right) - arr[i];
            }
            return res;
        }
    }