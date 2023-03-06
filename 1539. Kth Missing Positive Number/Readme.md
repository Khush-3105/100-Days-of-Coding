# Problem: Kth Missing Positive Number

Platform: Leetcode

Difficulty: Medium

Problem Link: https://leetcode.com/problems/kth-missing-positive-number/description/

## Problem Statement:

Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Return the kth positive integer that is missing from this array.

Example 1:

    Input: arr = [2,3,4,7,11], k = 5
    Output: 9
    Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

## Solution (In Java):

    class Solution {
        public int findKthPositive(int[] arr, int k) {
            int l = 0;
            int r = arr.length;
            while (l < r) {
            final int m = (l + r) / 2;
            if (arr[m] - m - 1 >= k)
                r = m;
            else
                l = m + 1;
            }
            return l + k;
        }
    }

## Output:
<img
  src="Output.png"
  alt="Alt text"
  title="Optional title"
  style="display: inline-block; margin: 0 auto; max-width: 300px">








