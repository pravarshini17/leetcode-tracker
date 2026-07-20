// Last updated: 7/20/2026, 10:19:49 AM
1class Solution {
2    public int largestRectangleArea(int[] heights) {
3
4        Stack<Integer> stack = new Stack<>();
5        int maxArea = 0;
6
7        for (int i = 0; i <= heights.length; i++) {
8
9            int currentHeight = (i == heights.length) ? 0 : heights[i];
10
11            while (!stack.isEmpty() &&
12                   currentHeight < heights[stack.peek()]) {
13
14                int height = heights[stack.pop()];
15
16                int width;
17
18                if (stack.isEmpty())
19                    width = i;
20                else
21                    width = i - stack.peek() - 1;
22
23                maxArea = Math.max(maxArea, height * width);
24            }
25
26            stack.push(i);
27        }
28
29        return maxArea;
30    }
31}