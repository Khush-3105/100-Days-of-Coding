# Problem: Shuffle the Array

Platform: Leetcode

Difficulty: Easy

Problem Link: https://leetcode.com/problems/shuffle-the-array/

## Problem Statement:

Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Example 1:

    Input: nums = [2,5,1,3,4,7], n = 3
    Output: [2,3,5,4,1,7] 
    Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

## My Approach:

    1. Create a new array of size 2n.
    2. We will run a loop from 0 to n.
    3. For all even indexes of result array we will add elements from index 0 of nums
    4. For all odd indexes of result array we will add elements from index n of nums

## Solution (In Java):

    class Solution {
        public int[] shuffle(int[] nums, int n) {
            int[] result = new int[2*n];
            for (int i= 0;i<n;i++){
                result[2*i]=nums[i];
                result[(2*i)+1]=nums[n+i];
            }
            return result;
        }
    }

## Output:
<img
  src="Output.png"
  alt="Alt text"
  title="Optional title"
  style="display: inline-block; margin: 0 auto; max-width: 300px">








