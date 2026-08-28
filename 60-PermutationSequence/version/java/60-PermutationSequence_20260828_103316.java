// Last updated: 8/28/2026, 10:33:16 AM
1import java.util.*;
2
3class Solution {
4    public boolean isValid(String s) {
5
6        Stack<Character> stack = new Stack<>();
7
8        for (char ch : s.toCharArray()) {
9
10            if (ch == '(' || ch == '[' || ch == '{') {
11                stack.push(ch);
12            }
13
14            else {
15
16                if (stack.isEmpty()) {
17                    return false;
18                }
19
20                char top = stack.pop();
21
22                if (ch == ')' && top != '(') {
23                    return false;
24                }
25
26                if (ch == ']' && top != '[') {
27                    return false;
28                }
29
30                if (ch == '}' && top != '{') {
31                    return false;
32                }
33            }
34        }
35
36        return stack.isEmpty();
37    }
38}