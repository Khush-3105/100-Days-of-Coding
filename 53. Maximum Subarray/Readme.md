# Problem: Maximum Subarray

Platform: Leetcode

Difficulty: Medium

Problem Link: https://leetcode.com/problems/maximum-subarray/

## Problem Statement:

Given an integer array nums, find the subarray with the largest sum, and return its sum. 

Example 1:

    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: The subarray [4,-1,2,1] has the largest sum 6.

## Solution (In Java):

    public class Solution {
        public int maxSubArray(int[] nums) {
            int sum =0, max = 0;
            for(int i=0; i< nums.length; i++){
                sum += nums[i];
                if(sum > max || i == 0) max = sum;
                if(sum < 0) sum =0;
            }
            return max;
        }
    }





