// Last updated: 8/28/2026, 10:01:30 AM
1class Solution {
2    public int areaOfMaxDiagonal(int[][] dimensions) {
3
4        int maxDiagonal = 0;
5        int maxArea = 0;
6
7        for (int[] rectangle : dimensions) {
8
9            int length = rectangle[0];
10            int width = rectangle[1];
11
12            int diagonal = length * length + width * width;
13            int area = length * width;
14
15            if (diagonal > maxDiagonal) {
16                maxDiagonal = diagonal;
17                maxArea = area;
18            }
19
20     
21            else if (diagonal == maxDiagonal) {
22                maxArea = Math.max(maxArea, area);
23            }
24        }
25
26        return maxArea;
27    }
28}