/*Merge two sorted linked lists and return it as a new list. 
 *The new list should be made by splicing together the nodes of the first two lists.
*/
package Algorithms;

public class P021_MergeTwoSortedLists {

	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        ListNode head = new ListNode(0);
	        ListNode now = head;
	        
	        //如果其中一个是null，就返回另一个
	        if(l1 == null) return l2;
	        else if(l2 == null) return l1;
	        
	        //按照归并排序的思想来
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
