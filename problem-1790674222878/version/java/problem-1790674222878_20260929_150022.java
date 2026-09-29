// Last updated: 9/29/2026, 3:00:22 PM
1class Solution {
2    public int strStr(String haystack, String needle) {
3
4        int n = haystack.length();
5        int m = needle.length();
6
7        // Check every possible starting position
8        for (int i = 0; i <= n - m; i++) {
9
10            int j = 0;
11
12            // Compare needle with haystack
13            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
14                j++;
15            }
16
17            // Entire needle matched
18            if (j == m) {
19                return i;
20            }
21        }
22
23        // Needle not found
24        return -1;
25    }
26}