// Last updated: 8/28/2026, 9:11:46 AM
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3        int n = nums.length;
4        int[] count = new int[n + 1];
5
6        
7        for (int num : nums) {
8            count[num]++;
9        }
10
11        int duplicate = 0;
12        int missing = 0;
13
14        
15        for (int i = 1; i <= n; i++) {
16            if (count[i] == 2) {
17                duplicate = i;
18            }
19            if (count[i] == 0) {
20                missing = i;
21            }
22        }
23
24        return new int[]{duplicate, missing};
25    }
26}