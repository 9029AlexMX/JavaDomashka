package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {
    private static final HashMap<Character,Character> bracketsMap = new HashMap<>();
    private static final List<Character> opening = Arrays.asList('(', '[', '{');
    private static final List<Character> closing = Arrays.asList(')', ']', '}');

    public static void init() {
        bracketsMap.put(')','(');
        bracketsMap.put(']','[');
        bracketsMap.put('}','{');
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (opening.contains(c)) {
                stack.push(c);
            }
            else if(stack.peek() == bracketsMap.get(c))
            {
                stack.pop();
            }
            else
            {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
