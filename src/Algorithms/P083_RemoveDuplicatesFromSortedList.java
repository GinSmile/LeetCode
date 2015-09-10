
/*
 * 
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *  example,
		Given 1->1->2, return 1->2.
		Given 1->1->2->3->3, return 1->2->3.
		
		
		简单的链表删除算法。
 * */

package Algorithms;

public class P083_RemoveDuplicatesFromSortedList {
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode lastNode = head;
        ListNode nextNode = head.next;
        while(nextNode != null){
            if(nextNode.val == lastNode.val){
                lastNode.next = nextNode.next;
            }else{
                lastNode = nextNode;
            }
            nextNode = nextNode.next;
        }
        return head;
    }
}