package org.example;

public class Main {
    public static void main(String[] args) {
        // Just testing.
        // testReversedLinkedList();
        testValidParentheses();
    }

    private static void testValidParentheses() {
        ValidParentheses.init();
        System.out.println(ValidParentheses.isValid("()"));
        System.out.println(ValidParentheses.isValid("()[]{}"));
        System.out.println(ValidParentheses.isValid("(]"));
        System.out.println(ValidParentheses.isValid("([])"));
    }

    private static void testReversedLinkedList() {
        ListNode head = ListNode.generate(1, 5);
        head.printThisAndAllNext();
        ListNode reversedIteratively = ReverseLinkedList.reverseIteratively(head);
        reversedIteratively.printThisAndAllNext();
        ListNode reversedRecursively = head.reverseRecursively(null);
        reversedRecursively.printThisAndAllNext();

        System.out.println("===================");

        ListNode head2 = ListNode.generate(1, 2);
        head2.printThisAndAllNext();
        ListNode reversedIteratively2 = ReverseLinkedList.reverseIteratively(head2);
        reversedIteratively2.printThisAndAllNext();
        ListNode reversedRecursively2 = head2.reverseRecursively(null);
        reversedRecursively2.printThisAndAllNext();

        System.out.println("===================");

        ListNode head3 = new ListNode(10);
        head3.printThisAndAllNext();
        ListNode reversedIteratively3 = ReverseLinkedList.reverseIteratively(head3);
        reversedIteratively3.printThisAndAllNext();
        ListNode reversedRecursively3 = head3.reverseRecursively(null);
        reversedRecursively3.printThisAndAllNext();

        // Not sure how to create "Input: head = []" since looks like head means that it least 1 value is present.
    }
}