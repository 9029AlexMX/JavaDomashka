package org.example;

public class Main {
    public static void main(String[] args) {
        // Just testing.
        System.out.println("=================== TEST REVERSED LINKED LIST ===================");
        testReversedLinkedList();
        System.out.println("=================== TEST VALID PARENTHESES ===================");
        testValidParentheses();
        System.out.println("=================== TEST MOVE ZEROES ===================");
        testMoveZeroes();
    }

    private static void testMoveZeroes() {
        MoveZeroes.test(new int[]{0,1,0,3,12});
        MoveZeroes.test(new int[]{0});
        MoveZeroes.test(new int[]{1,2,3,4});
        MoveZeroes.test(new int[]{0,0,0,1,0,2,3,0,0,4,0,0});
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