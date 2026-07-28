// Last updated: 7/28/2026, 2:41:10 PM
1class Solution {
2    public int minimumTotal(List<List<Integer>> triangle) {
3
4        // Copy the last row
5        List<Integer> dp = new ArrayList<>(triangle.get(triangle.size() - 1));
6
7        // Start from the second-last row
8        for (int i = triangle.size() - 2; i >= 0; i--) {
9            for (int j = 0; j <= i; j++) {
10                dp.set(j, triangle.get(i).get(j) + Math.min(dp.get(j), dp.get(j + 1)));
11            }
12        }
13
14        return dp.get(0);
15    }
16}