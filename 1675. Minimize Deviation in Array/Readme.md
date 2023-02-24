# Problem: Minimize Deviation in Array

Platform: Leetcode

Difficulty: Hard

Problem Link: https://leetcode.com/problems/minimize-deviation-in-array/

## Problem Statement:

You are given an array nums of n positive integers.

You can perform two types of operations on any element of the array any number of times:

If the element is even, divide it by 2.
For example, if the array is [1,2,3,4], then you can do this operation on the last element, and the array will be [1,2,3,2].
If the element is odd, multiply it by 2.
For example, if the array is [1,2,3,4], then you can do this operation on the first element, and the array will be [2,2,3,4].
The deviation of the array is the maximum difference between any two elements in the array.

Return the minimum deviation the array can have after performing some number of operations.

Example 1:

    Input: nums = [1,2,3,4]
    Output: 1
    Explanation: You can transform the array to [1,2,3,2], then to [2,2,3,2], then the deviation will be 3 - 2 = 1.

## Solution (In Java):

    class Solution {
        public int minimumDeviation(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        TreeSet<Integer> set=new TreeSet<>();
        for(int i:nums){
            if( (i & 1) == 1){
                i = i << 1;
            }
            set.add(i);
        }
        int min=set.last()-set.first();
        int max=set.last();
        while((max & 1) ==0){
            set.remove(max);
            max = max>>1;
            set.add(max);
            max=set.last();
            int i=set.last()-set.first();
            if(i<min) min=i;
        }
        return min;
    }
    }





