# Problem: Greatest Common Divisor of Strings

Platform: Leetcode

Difficulty: Easy

Problem Link: https://leetcode.com/problems/greatest-common-divisor-of-strings/

## Problem Statement:

For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).\
Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

Example 1:

        Input: str1 = "ABCABC", str2 = "ABC"
        Output: "ABC"

## My Approach:

String = "ABAB" OR "ABABABAB" OR "ABABABABABAB"... \
Divisor = "AB" OR "ABABAB" \
For the given string all the divisors are mentioned above. \
GCD = "ABABAB"\
As it is the longest divisor for all the strings.\
Input: str1 = "ABCABC", str2 = "ABC"

        Case 1:
            If str1 == str2
            GCD = str1 or str2

        Case 2: 
            For GCD-  str1 + str2 = str2 + str1   ----> Multiplication of GCD

                1. Store the longest string in str1
                2. Search the str2 in str1
                3. If found seperate it and check if the remaing str1 is greater or equal in lenght to str2
                    - continue this till end of str1
                    - if str 1 can be divided in equal parts of str2 the 
                    - **GCD=str2**

                    eg: str1="ABABABAB" & str2="ABAB"
                        ABAB | ABAB
                        Hence, GCD=ABAB
                4. If all parts are not equal then
                    - str1 = str2
                    - str2 = last part of str1

                    eg: str1="ABCABCABC" & str2="ABCABC"
                        ABCABC | ABC
                        As all parts are not same
                        str1="ABCABC" --> str2
                        str2="ABC" --> last part of str1
                5. If still no GCD then repeat the process.

            Else no GCD



## Solution (In Java):

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

## Output:
<img
  src="Output.png"
  alt="Alt text"
  title="Optional title"
  style="display: inline-block; margin: 0 auto; max-width: 300px">








