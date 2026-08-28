// Last updated: 8/28/2026, 9:33:29 AM
1class Solution {
2    public void rotate(int[][] matrix) {
3
4        int n = matrix.length;
5
6        for (int i = 0; i < n; i++) {
7            for (int j = i + 1; j < n; j++) {
8
9                int temp = matrix[i][j];
10                matrix[i][j] = matrix[j][i];
11                matrix[j][i] = temp;
12            }
13        }
14
15        
16        for (int i = 0; i < n; i++) {
17
18            int left = 0;
19            int right = n - 1;
20
21            while (left < right) {
22
23                int temp = matrix[i][left];
24                matrix[i][left] = matrix[i][right];
25                matrix[i][right] = temp;
26
27                left++;
28                right--;
29            }
30        }
31    }
32}