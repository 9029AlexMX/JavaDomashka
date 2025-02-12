package org.example;


public class ReverseLinkedList {
    private ReverseLinkedList() {
    }

    /**
     * Runs iterative solution.
     *
     * @param head Head of list that should be reversed.
     * @return Head of reversed list.
     */
    public static ListNode reverseIteratively(ListNode head) {
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
