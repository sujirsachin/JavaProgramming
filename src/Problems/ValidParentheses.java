/*
* Source: LeetCode
* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
* An input string is valid if:
    * Open brackets must be closed by the same type of brackets.
    * Open brackets must be closed in the correct order.
* Example 1:
    * Input: s = "()"
    * Output: true
* Example 2:
    * Input: s = "()[]{}"
    * Output: true
* Example 3:
    * Input: s = "(]"
    * Output: false
* Example 4:
    * Input: s = "([)]"
    * Output: false
* Example 5:
    * Input: s = "{[]}"
    * Output: true
 */
package Problems;

import java.util.Stack;

public class ValidParentheses {
    public static boolean validSetOfParentheses(String s)
    {
        if(s.length()<2)
        {
            return false;
        }
        if(s.length()%2!=0)
        {
            return false;
        }
        Stack<Character> parenthesis=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c=='(' || c=='[' || c=='{')
            {
                parenthesis.push(c);
            }
            else if(c==')' && !parenthesis.isEmpty() && parenthesis.peek()=='(')
            {
                parenthesis.pop();
            }
            else if(c=='}' && !parenthesis.isEmpty() && parenthesis.peek()=='{')
            {
                parenthesis.pop();
            }
            else if(c==']' && !parenthesis.isEmpty() && parenthesis.peek()=='[')
            {
                parenthesis.pop();
            }
            else
            {
                return false;
            }
        }
       return parenthesis.isEmpty();
    }
    public static void main(String args[])
    {
        System.out.println(validSetOfParentheses("()"));
    }
}
