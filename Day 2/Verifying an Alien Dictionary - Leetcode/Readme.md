# Problem: Verifying an Alien Dictionary

Platform: Leetcode

Difficulty: Easy

Problem Link: https://leetcode.com/problems/verifying-an-alien-dictionary/

## Problem Statement:

In an alien language, surprisingly, they also use English lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.

Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given words are sorted lexicographically in this alien language.

Example 1:

    Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"

    Output: true

    Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.

Example 2:

    Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"

    Output: false

    Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.

## My Approach:





# Solution (In Java):

        class Solution {

            public String gcdOfStrings(String str1, String str2) {

                if(!(str1+str2).equals(str2+str1)) return "";

                else if(str1.equals(str2)) return str1;


                else if(str1.length()>str2.length()){
                    return gcdOfStrings(str1.substring(str2.length()), str2 );
                }
                else{
                    return gcdOfStrings(str2.substring(str1.length()), str1 );
                }

            }
        }

# Output:
<img
  src="Output.png"
  alt="Alt text"
  title="Optional title"
  style="display: inline-block; margin: 0 auto; max-width: 300px">








