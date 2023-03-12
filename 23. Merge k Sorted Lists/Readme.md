# Problem: Merge k Sorted Lists

Platform: Leetcode

Difficulty: Hard

Problem Link: https://leetcode.com/problems/merge-k-sorted-lists/description/

## Problem Statement:

You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.

Example 1:

    Input: lists = [[1,4,5],[1,3,4],[2,6]]
    Output: [1,1,2,3,4,4,5,6]
    Explanation: The linked-lists are:
    [
    1->4->5,
    1->3->4,
    2->6
    ]
    merging them into one sorted list:
    1->1->2->3->4->4->5->6


## Solution (In Java):

    class Solution {
	    public ListNode mergeKLists(ListNode[] lists) {
	        int len = lists.length;
	        if(len == 0 )   return null;
	        if(1 == len) return lists[0];
	        ListNode result = new ListNode(0);
	        result.next = lists[0];
	        for(int i= 1; i < len; i++){
	            result = mergeTwoList(result, lists[i]);
	        }
	        return result.next;
	    }
	    private ListNode mergeTwoList(ListNode result, ListNode mergeList){
	        ListNode ans = new ListNode(0);
	        ListNode dummy  = ans;
	        ListNode head = new ListNode(0);
	        head.next = mergeList;
	        while(head.next != null || result.next != null){
	            if(head.next != null && result.next != null){
	                if(head.next.val <= result.next.val){
	                    ans.next = head.next;
	                    head.next = head.next.next;
	                }else{
	                    ans.next = result.next;
	                    result.next = result.next.next;
	                }
	                ans = ans.next;
	            }else if(head.next != null && result.next == null){
	                ans.next = head.next;
	                break;
	            }else{
	                ans.next = result.next;
	                break;
	            }
	        }
	        return dummy;
	    }
	}

## Output:
<img
  src="Output.png"
  alt="Alt text"
  title="Optional title"
  style="display: inline-block; margin: 0 auto; max-width: 300px">








