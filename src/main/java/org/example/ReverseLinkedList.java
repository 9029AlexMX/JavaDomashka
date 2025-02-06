package org.example;


public class ReverseLinkedList {
    public static ListNode reverseIteratively(ListNode head) {
        // "A linked list can be reversed either iteratively or recursively. Could you implement both?"
        // Not sure. As I understand this is recursive implementation ?

        ListNode toReverse = head;
        ListNode reversed = new ListNode(head.val);
        while (toReverse.next != null)
        {
            reversed = new ListNode(toReverse.next.val, reversed);
            toReverse = toReverse.next;
        }

        return reversed;
    }
}
