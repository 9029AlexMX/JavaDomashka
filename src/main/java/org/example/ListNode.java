package org.example;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    /**
     * Added just for testing.
     */
    public void printThisAndAllNext() {
        ListNode reversed = this;
        do
        {
            System.out.println(reversed.val);
            reversed=reversed.next;
        }
        while (reversed != null);
    }

    /**
     * Added just for testing.
     */
    public static ListNode generate(int start, int end)
    {
        ListNode head = new ListNode();
        ListNode node = head;
        for (int i = start; i <= end; i++)
        {
            node.val = i;
            node.next = i < end ? new ListNode() : null;
            node = node.next;
        }

        return head;
    }

    public ListNode reverseRecursively(ListNode next)
    {
        if(this.next != null)
        {
            return this.next.reverseRecursively(new ListNode(this.val, next));
        }
        else
        {
            return new ListNode(this.val, next);
        }
    }
}
