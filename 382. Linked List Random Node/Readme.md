# Problem: Linked List Random Node

Platform: Leetcode

Difficulty: Medium

Problem Link: https://leetcode.com/problems/linked-list-random-node/description/

## Problem Statement:

Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.

Implement the Solution class:

Solution(ListNode head) Initializes the object with the head of the singly-linked list head.
int getRandom() Chooses a node randomly from the list and returns its value. All the nodes of the list should be equally likely to be chosen.
 
Example 1:

    Input
    ["Solution", "getRandom", "getRandom", "getRandom", "getRandom", "getRandom"]
    [[[1, 2, 3]], [], [], [], [], []]
    Output
    [null, 1, 3, 2, 2, 3]

    Explanation
    Solution solution = new Solution([1, 2, 3]);
    solution.getRandom(); // return 1
    solution.getRandom(); // return 3
    solution.getRandom(); // return 2
    solution.getRandom(); // return 2
    solution.getRandom(); // return 3
    // getRandom() should return either 1, 2, or 3 randomly. Each element should have equal probability of returning.

## Solution (In Java):

    class Solution {
        public Solution(ListNode head) {
            this.head = head;
        }
        public int getRandom() {
            int ans = -1;
            int i = 1;

            for (ListNode curr = head; curr != null; curr = curr.next, ++i)
            if (rand.nextInt(i) == i - 1)
                ans = curr.val;

            return ans;
        }
        private ListNode head;
        private Random rand = new Random();
    }


## Output:
<img
  src="Output.png"
  alt="Alt text"
  title="Optional title"
  style="display: inline-block; margin: 0 auto; max-width: 300px">








