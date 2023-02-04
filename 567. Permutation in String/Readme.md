# Problem: Permutation in String

Platform: Leetcode

Difficulty: Medium

Problem Link: https://leetcode.com/problems/permutation-in-string/

## Problem Statement:

Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.


Example 1:

    Input: s1 = "ab", s2 = "eidbaooo"
    Output: true
    Explanation: s2 contains one permutation of s1 ("ba").

Example 2:

    Input: s1 = "ab", s2 = "eidboaoo"
    Output: false

## My Approach:

    1. The size of every permutation of s1 is same and also frequency of every character is same.
    2. So all permutations of s1 are anagrams.
    3. Create a character array and store thr frequency of each character in s1.
    4. Now size of s2>=s1 else return false
    5. By using sliding window algorithm
    6. We will have two pointers on s2 where 'i' will be the starting index and 'j' will be the ending index.
    7.

## Solution (In Java):

    class Solution {
        public boolean checkInclusion(String s1, String s2) {
            int[] map = new int[26];
            for(char c : s1.toCharArray()) map[c - 'a']++;
            int j = 0, i = 0;
            int count_chars = s1.length();
            while(j < s2.length()){
                if(map[s2.charAt(j++) - 'a']-- > 0)
                    count_chars--;
                if(count_chars == 0) return true;
                if(j - i == s1.length() && map[s2.charAt(i++) - 'a']++ >= 0)
                    count_chars++;
            }
            return false;
        }
    }

## Output:
<img
  src="Output.png"
  alt="Alt text"
  title="Optional title"
  style="display: inline-block; margin: 0 auto; max-width: 300px">








