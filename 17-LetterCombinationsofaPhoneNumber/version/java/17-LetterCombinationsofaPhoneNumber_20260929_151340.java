// Last updated: 9/29/2026, 3:13:40 PM
1class Solution {
2    public List<String> letterCombinations(String digits) {
3        
4        List<String> result = new ArrayList<>();
5
6        if (digits.length() == 0) {
7            return result;
8        }
9
10        String[] keypad = {
11            "", "", "abc", "def", "ghi",
12            "jkl", "mno", "pqrs", "tuv", "wxyz"
13        };
14
15        backtrack(digits, 0, "", result, keypad);
16
17        return result;
18    }
19
20    private void backtrack(String digits, int index, String current,
21                            List<String> result, String[] keypad) {
22
23        // All digits are processed
24        if (index == digits.length()) {
25            result.add(current);
26            return;
27        }
28
29        // Get letters for current digit
30        String letters = keypad[digits.charAt(index) - '0'];
31
32        // Try every letter
33        for (char ch : letters.toCharArray()) {
34            backtrack(digits, index + 1, current + ch, result, keypad);
35        }
36    }
37}