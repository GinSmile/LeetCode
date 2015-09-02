/*Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?
*/

/*
 * 做法：把所有经过的node全部指向head！这样，之后只要检测到node.next == head就代表有环
 */


package Algorithms;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class P141_LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode node = head,pre = head;
        while(node != null && node.next!=null){
            if(node.next == head) return true;
            pre = node;
            node = node.next;
            pre.next = head;
        }
        return false;
    }
}