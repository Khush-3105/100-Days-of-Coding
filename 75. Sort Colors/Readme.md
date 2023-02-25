# Problem: Sort Colors

Platform: Leetcode

Difficulty: Medium

Problem Link: https://leetcode.com/problems/sort-colors/description/

## Problem Statement:

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

Example 1:

    Input: nums = [2,0,2,1,1,0]
    Output: [0,0,1,1,2,2]

## Solution (In Java):

    class Solution {
        public void sortColors(int[] a) {
            int lo = 0;
            int hi = a.length - 1;
            int mid = 0, temp = 0;
            while (mid <= hi) {
                switch (a[mid]) {
                    case 0: {
                        temp = a[lo];
                        a[lo] = a[mid];
                        a[mid] = temp;
                        lo++;
                        mid++;
                        break;
                    }
                    case 1:
                        mid++;
                        break;
                    case 2: {
                        temp = a[mid];
                        a[mid] = a[hi];
                        a[hi] = temp;
                        hi--;
                        break;
                    } 
                }
            }
        }
    }