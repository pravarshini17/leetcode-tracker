// Last updated: 8/28/2026, 10:23:11 AM
1import java.util.*;
2
3class Solution {
4    public String getPermutation(int n, int k) {
5
6        List<Integer> numbers = new ArrayList<>();
7
8        for (int i = 1; i <= n; i++) {
9            numbers.add(i);
10        }
11
12        int factorial = 1;
13
14        for (int i = 1; i < n; i++) {
15            factorial *= i;
16        }
17
18   
19        k--;
20
21        StringBuilder result = new StringBuilder();
22
23        for (int i = n; i > 0; i--) {
24
25            int index = k / factorial;
26
27            result.append(numbers.get(index));
28
29            numbers.remove(index);
30
31            k = k % factorial;
32
33            if (i > 1) {
34                factorial = factorial / (i - 1);
35            }
36        }
37
38        return result.toString();
39    }
40}