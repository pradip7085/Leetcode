import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (ch == ')' && top != '(')
                    return false;

                if (ch == '}' && top != '{')
                    return false;
https://leetcode.com/_next/static/images/dark-pending-f313d6fe32951fb6b4d48ad3ee4f3821.gif$0
                if (ch == ']' && top != '[')
                    return false;
            }
        }

        return stack.isEmpty();
    }
}