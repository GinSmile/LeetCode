/*
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 * */

package Algorithms;

public class P002_AddTwoNumbers {

	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        if(l1 == null) return l2;
	        if(l2 == null) return l1;
	                
	        ListNode head = new ListNode(0);
	        ListNode last = head;
	        int sum = 0, carry = 0;
	        int a,b;
	        while(l1 != null || l2 != null){
	            if(l1 == null) a = 0;
	            else a = l1.val;
	            if(l2 == null) b = 0;
	            else b = l2.val;
	            
	            sum = a + b + carry;
	            ListNode cur = new ListNode(0);
	            cur.val = sum%10;
	            carry = sum/10;
	            
	            last.next = cur;
	            last = cur;
	            
	            l1 = l1 == null ? null : l1.next;
	            l2 = l2 == null ? null : l2.next;

	        }
	        
	        //考虑最后一位
	        if(carry != 0){
	            ListNode cur = new ListNode(0);
	            cur.val = carry;
	            cur.next = null;
	            last.next = cur;
	        }else{
	            last.next = null;
	        }
	        
	        
	        return head.next;
	    }
	}
