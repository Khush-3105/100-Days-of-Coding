# Problem: Climbing Stairs

Platform: Leetcode

Difficulty: Easy

Problem Link: https://leetcode.com/problems/climbing-stairs/

## Problem Statement:

You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:

    Input: n = 2
    Output: 2
    Explanation: There are two ways to climb to the top.
    1. 1 step + 1 step
    2. 2 steps

Example 2:

    Input: n = 3
    Output: 3
    Explanation: There are three ways to climb to the top.
    1. 1 step + 1 step + 1 step
    2. 1 step + 2 steps
    3. 2 steps + 1 step

## My Approach:

    1. We recursion to get the solution
    2. Also we store the value of all previously visted nodes in a array so we dont need to re calculate.


## Solution (In Java):

    class Solution {
        public int climbStairs(int n) {
            int arr[]= new int[n+1];
            return rec(n,arr);
        }
        public static int rec(int n,int arr[]){
            if(n<=1)return 1;
            if(arr[n]>0)return arr[n];
            int a=rec(n-1,arr);
            int b=rec(n-2,arr);
            arr[n]=a+b;
            return a+b;

        }
    }

## Output:
<img
  src="Output.png"
  alt="Alt text"
  title="Optional title"
  style="display: inline-block; margin: 0 auto; max-width: 300px">








