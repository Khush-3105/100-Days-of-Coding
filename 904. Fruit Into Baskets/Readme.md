# Problem: Fruit Into Baskets

Platform: Leetcode

Difficulty: Medium

Problem Link: https://leetcode.com/problems/fruit-into-baskets/

## Problem Statement:

You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.

You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:

You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
Given the integer array fruits, return the maximum number of fruits you can pick.

Example 1:

    Input: fruits = [1,2,1]
    Output: 3
    Explanation: We can pick from all 3 trees.

Example 2:

    Input: fruits = [0,1,2,2]
    Output: 3
    Explanation: We can pick from trees [1,2,2].
    If we had started at the first tree, we would only pick from trees [0,1].

## My Approach:

    1. We make a result array of size 2.
    2. Run an outer loop i from 0 to size of nums -1.
    3. Run an Inner loop j from i to size of nums.
    4. Now we check if nums[i]+nums[j]== target
        -If true we add i and j in result array and return it.
    5. Else we also check from the end of the nums array if those are equal to target, we return those indexes.
    Eg:
        nums=[1,2,5,7,8,9,6,1,4]
        target=5
        - In step 4 we check from index 0
            Hence nums[0]+nums[1,2,3,....]
        - In step 5 we check from index 8
            Hence nums[8]+nums[7,6,5,....]


## Solution (In Java):

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] res = new int[2];
            for (int i = 0; i < nums.length-1; i++) {
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        res[0] = i;
                        res[1] = j;
                        return res;
                    }
                    if (nums[nums.length - 1 - i] + nums[nums.length - 1 - j] == target) {
                        res[0] = nums.length - 1 - i;
                        res[1] = nums.length - 1 - j;
                        return res;
                    }
                }
            }
            return null;
        }
    }

## Output:
<img
  src="Output.png"
  alt="Alt text"
  title="Optional title"
  style="display: inline-block; margin: 0 auto; max-width: 300px">








