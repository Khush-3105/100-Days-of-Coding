# Problem: Minimum Moves to Equal Array Elements II

Platform: Leetcode

Difficulty: Medium

Problem Link: https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/

## Problem Statement:

Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.

In one move, you can increment or decrement an element of the array by 1.

Test cases are designed so that the answer will fit in a 32-bit integer.

Example 1:

    Input: nums = [1,2,3]
    Output: 2
    Explanation:
    Only two moves are needed (remember each move increments or decrements one element):
    [1,2,3]  =>  [2,2,3]  =>  [2,2,2]

## Solution (In Java):

    class Solution {
        public static int findMedian(int a[], int n)
        {
            // First we sort the array
            Arrays.sort(a);
    
            // check for even case
            if (n % 2 != 0)
                return (int)a[n / 2];
    
            return (int)(a[(n - 1) / 2] + a[n / 2]) / 2;
        }
        public int minMoves2(int[] a) {
            int count=0,median; 
            
            median = findMedian(a,a.length);
            
            for(int i = 0 ; i<a.length;i++){
                if (a[i] > median)
                    count += a[i]-median;
                else
                    count += median-a[i];
            }
            return(count);

        }
    }