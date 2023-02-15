# Problem: Add to Array-Form of Integer

Platform: Leetcode

Difficulty: Easy

Problem Link: https://leetcode.com/problems/add-to-array-form-of-integer/

## Problem Statement:

The array-form of an integer num is an array representing its digits in left to right order.

For example, for num = 1321, the array form is [1,3,2,1].
Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

 

Example 1:

    Input: num = [1,2,0,0], k = 34
    Output: [1,2,3,4]
    Explanation: 1200 + 34 = 1234

## Solution (In Java):

    class Solution {
        public List<Integer> addToArrayForm(int[] num, int k) {
            List<Integer> ans = new LinkedList<>();

            for (int i = num.length - 1; i >= 0; --i) {
            ans.add(0, (num[i] + k) % 10);
            k = (num[i] + k) / 10;
            }

            while (k > 0) {
            ans.add(0, k % 10);
            k /= 10;
            }

            return ans;
        }
    }
## Output:
<img
  src="Output.png"
  alt="Alt text"
  title="Optional title"
  style="display: inline-block; margin: 0 auto; max-width: 300px">








