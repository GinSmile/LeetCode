/*
 * 经典的反转链表
 * */

package Algorithms;

public class P206_ReverseLinkedList {

	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode cur = head.next;
        head.next = null;
        ListNode lastNode = head;
        
        //从第二个节点开始，将当前节点进行反转，设置cur.next为前一个节点
        while(true){
            ListNode nextNode = cur.next;
            cur.next = lastNode;
            lastNode = cur;
            cur = nextNode;
            if(cur == null) return lastNode;
        }
    }
	
	}
