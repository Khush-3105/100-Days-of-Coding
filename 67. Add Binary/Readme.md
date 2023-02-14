# Problem: Add Binary

Platform: Leetcode

Difficulty: Easy

Problem Link: https://leetcode.com/problems/add-binary/

## Problem Statement:

Given two binary strings a and b, return their sum as a binary string.

Example 1:

    Input: a = "11", b = "1"
    Output: "100"  

## Solution (In Python):
    
    class Solution:
        def addBinary(self, a: str, b: str) -> str:
            return bin(int(a, 2) + int(b, 2))[2:]

## Output:
<img
  src="Output.png"
  alt="Alt text"
  title="Optional title"
  style="display: inline-block; margin: 0 auto; max-width: 300px">








