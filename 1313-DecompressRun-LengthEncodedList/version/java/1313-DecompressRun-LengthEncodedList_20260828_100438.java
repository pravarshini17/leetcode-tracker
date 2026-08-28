// Last updated: 8/28/2026, 10:04:38 AM
1import java.util.*;
2
3class Solution {
4    public int[] decompressRLElist(int[] nums) {
5
6        ArrayList<Integer> list = new ArrayList<>();
7
8        for (int i = 0; i < nums.length; i += 2) {
9
10            int freq = nums[i];
11            int val = nums[i + 1];
12
13            for (int j = 0; j < freq; j++) {
14                list.add(val);
15            }
16        }
17
18        int[] result = new int[list.size()];
19
20        for (int i = 0; i < list.size(); i++) {
21            result[i] = list.get(i);
22        }
23
24        return result;
25    }
26}