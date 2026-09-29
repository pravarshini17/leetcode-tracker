// Last updated: 9/29/2026, 2:11:49 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int left = 0;
4        int right = height.length - 1;
5        int maxWater = 0;
6
7        while (left < right) {
8            int width = right - left;
9            int minHeight = Math.min(height[left], height[right]);
10
11            int area = width * minHeight;
12
13            maxWater = Math.max(maxWater, area);
14
15            if (height[left] < height[right]) {
16                left++;
17            } else {
18                right--;
19            }
20        }
21
22        return maxWater;
23    }
24}