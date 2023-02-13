# Problem: Count Odd Numbers in an Interval Range

Platform: Leetcode

Difficulty: Easy

Problem Link: https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/

## Problem Statement:

Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).

Example 1:

    Input: low = 3, high = 7
    Output: 3
    Explanation: The odd numbers between 3 and 7 are [3,5,7].

## Solution (In Java):

    class Solution {
        public int countOdds(int low, int high) {
            int N = (high - low) / 2;
            if (high % 2 != 0 || low % 2 != 0)N++;
            return N;
        }
    }

## Output:
<img
  src="Output.png"
  alt="Alt text"
  title="Optional title"
  style="display: inline-block; margin: 0 auto; max-width: 300px">








