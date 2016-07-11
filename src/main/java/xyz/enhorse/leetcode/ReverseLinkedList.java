package xyz.enhorse.leetcode;

/**
 * https://leetcode.com/problems/reverse-linked-list/
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode current = null;
        ListNode tmp = head;
        ListNode previous = null;
        while (tmp != null) {
            previous = current;
            current = tmp;
            tmp = current.next;
            current.next = previous;
        }
        return current;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
