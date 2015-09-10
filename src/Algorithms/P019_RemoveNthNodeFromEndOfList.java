/*
 * Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.
 * */
package Algorithms;

public class P019_RemoveNthNodeFromEndOfList {

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //用两个变量，一个node1，一个node2，他俩相隔n
        
        ListNode node1 = head, node2 = head;
        //头结点的情况
        while(n-- != 0){
            node1 = node1.next;
        }
        if(node1 == null) return head.next;
        
        //非头结点的情况
        while(node1.next != null){
            node1 = node1.next;
            node2 = node2.next;
        }
        //把node2的下一个去除
        node2.next = node2.next.next;
        
        return head;
    }
}
