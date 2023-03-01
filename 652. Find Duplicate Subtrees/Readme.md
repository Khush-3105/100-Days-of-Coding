# Problem: Find Duplicate Subtrees

Platform: Leetcode

Difficulty: Medium

Problem Link: https://leetcode.com/problems/find-duplicate-subtrees/description/

## Problem Statement:

Given the root of a binary tree, return all duplicate subtrees.

For each kind of duplicate subtrees, you only need to return the root node of any one of them.

Two trees are duplicate if they have the same structure with the same node values.

Example 1:

    Input: root = [1,2,3,4,null,2,4,null,null,4]
    Output: [[2,4],[4]]

## Solution (In Java):

    class Solution {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> ans = new ArrayList<>();
        Map<String, Integer> count = new HashMap<>();
        encode(root, count, ans);
        return ans;
    }

    private String encode(TreeNode root, Map<String, Integer> count, List<TreeNode> ans) {
        if (root == null)
        return "";

        final String encoded =
            root.val + "#" + encode(root.left, count, ans) + "#" + encode(root.right, count, ans);
        count.merge(encoded, 1, Integer::sum);
        if (count.get(encoded) == 2)
        ans.add(root);
        return encoded;
    }
    }

## Output:
<img
  src="Output.png"
  alt="Alt text"
  title="Optional title"
  style="display: inline-block; margin: 0 auto; max-width: 300px">








