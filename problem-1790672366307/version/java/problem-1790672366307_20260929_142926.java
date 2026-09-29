// Last updated: 9/29/2026, 2:29:26 PM
1class Solution {
2    public List<String> generateParenthesis(int n) {
3        List<String> result = new ArrayList<>();
4
5        backtrack(result, "", 0, 0, n);
6
7        return result;
8    }
9
10    private void backtrack(List<String> result, String current,
11                            int open, int close, int n) {
12
13        // If we used all parentheses
14        if (current.length() == 2 * n) {
15            result.add(current);
16            return;
17        }
18
19        // Add opening parenthesis
20        if (open < n) {
21            backtrack(result, current + "(", open + 1, close, n);
22        }
23
24        // Add closing parenthesis
25        if (close < open) {
26            backtrack(result, current + ")", open, close + 1, n);
27        }
28    }
29}