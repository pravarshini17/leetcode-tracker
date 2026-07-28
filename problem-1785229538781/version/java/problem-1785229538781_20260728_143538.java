// Last updated: 7/28/2026, 2:35:38 PM
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>> triangle = new ArrayList<>();
4
5        for (int i = 0; i < numRows; i++) {
6            List<Integer> row = new ArrayList<>();
7
8            for (int j = 0; j <= i; j++) {
9                // First and last elements are always 1
10                if (j == 0 || j == i) {
11                    row.add(1);
12                } else {
13                    // Sum of the two elements above
14                    int value = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
15                    row.add(value);
16                }
17            }
18
19            triangle.add(row);
20        }
21
22        return triangle;
23    }
24}