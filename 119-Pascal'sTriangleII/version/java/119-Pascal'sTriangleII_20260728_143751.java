// Last updated: 7/28/2026, 2:37:51 PM
1class Solution {
2    public List<Integer> getRow(int rowIndex) {
3        List<Integer> row = new ArrayList<>();
4
5        row.add(1); // First row
6
7        for (int i = 1; i <= rowIndex; i++) {
8            // Update from right to left
9            for (int j = i - 1; j >= 1; j--) {
10                row.set(j, row.get(j - 1) + row.get(j));
11            }
12            row.add(1); // Last element is always 1
13        }
14
15        return row;
16    }
17}