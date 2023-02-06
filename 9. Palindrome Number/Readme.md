# Problem: Palindrome Number

Platform: Leetcode

Difficulty: Easy

Problem Link: https://leetcode.com/problems/palindrome-number/

## Problem Statement:

Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:

    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:

    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

## My Approach:

    1. If the number is greater than 0.
    2. We reverse the number
    3. If x==reverse number then return true


## Solution (In Java):

    class Solution {
        public boolean isPalindrome(int x) {
            if (x<0) return false;
            int a=x;
            int rev = 0;
            while (x!=0){
                int temp = x%10;
                rev=rev*10+temp;
                x=x/10;
            }
            if(a==rev)return true;
            else return false;
            
        }
    }

## Output:
<img
  src="Output.png"
  alt="Alt text"
  title="Optional title"
  style="display: inline-block; margin: 0 auto; max-width: 300px">








