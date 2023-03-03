# Problem: Find the Index of the First Occurrence in a String

Platform: Leetcode

Difficulty: Medium

Problem Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

## Problem Statement:

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

    Input: haystack = "sadbutsad", needle = "sad"
    Output: 0
    Explanation: "sad" occurs at index 0 and 6.
    The first occurrence is at index 0, so we return 0.

Example 2:

    Input: haystack = "leetcode", needle = "leeto"
    Output: -1
    Explanation: "leeto" did not occur in "leetcode", so we return -1.

## Solution (In Java):

    class Solution {
    public int strStr(String haystack, String needle) {
        final int m = haystack.length();
        final int n = needle.length();

        for (int i = 0; i < m - n + 1; ++i)
        if (haystack.substring(i, i + n).equals(needle))
            return i;

        return -1;
    }
    }

## Output:
<img
  src="Output.png"
  alt="Alt text"
  title="Optional title"
  style="display: inline-block; margin: 0 auto; max-width: 300px">








