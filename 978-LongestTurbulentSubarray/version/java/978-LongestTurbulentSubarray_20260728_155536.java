// Last updated: 7/28/2026, 3:55:36 PM
1class Solution {
2    public int maxTurbulenceSize(int[] arr) {
3        int n = arr.length;
4
5        if (n == 1)
6            return 1;
7
8        int inc = 1;
9        int dec = 1;
10        int max = 1;
11
12        for (int i = 1; i < n; i++) {
13            if (arr[i] > arr[i - 1]) {
14                inc = dec + 1;
15                dec = 1;
16            } else if (arr[i] < arr[i - 1]) {
17                dec = inc + 1;
18                inc = 1;
19            } else {
20                inc = 1;
21                dec = 1;
22            }
23
24            max = Math.max(max, Math.max(inc, dec));
25        }
26
27        return max;
28    }
29}