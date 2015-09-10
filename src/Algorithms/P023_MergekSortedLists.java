/*Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.*/
package Algorithms;

public class P023_MergekSortedLists {
	
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	    public ListNode mergeKLists(ListNode[] lists) {
	        if(lists.length == 0) return null;
	        return mergeKLists(lists, 0, lists.length - 1);
	    }
	    
	    public ListNode mergeKLists(ListNode[] lists, int left, int right) {	    
	        if(left == right){
	        	return lists[left];	 
	        }
	        int mid = left + (right - left)/2;
	        return mergeTwoLists(mergeKLists(lists, left, mid), mergeKLists(lists, mid + 1, right));
	    }
	    
	    //利用合并两个有序链表的方法
	    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        ListNode head = new ListNode(0);
	        ListNode now = head;
	        
	        if(l1 == null) return l2;
	        else if(l2 == null) return l1;
	        
	        //归并排序的思想
	        while(true){
	            if(l1.val < l2.val){
	                now.next = l1;
	                now = l1;
	                l1 = l1.next;
	            }else{
	                now.next = l2;
	                now = l2;
	                l2 = l2.next;
	            }
	            
	          //如果遇到其中一个链表的末尾，那就指向另一个链表
	            if(l1 == null){
	                now.next = l2;
	                break;
	            }else if(l2 == null){
	                now.next = l1;
	                break;
	            }
	        }
	        return head.next;
	    }
	}
