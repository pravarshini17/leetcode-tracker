// Last updated: 8/28/2026, 9:39:28 AM
1import java.util.*;
2
3class Solution {
4    public int findMaxLength(int[] nums) {
5
6        HashMap<Integer, Integer> map = new HashMap<>();
7
8       
9        map.put(0, -1);
10
11        int sum = 0;
12        int maxLength = 0;
13
14        for (int i = 0; i < nums.length; i++) {
15
16           
17            if (nums[i] == 0) {
18                sum--;
19            } else {
20                sum++;
21            }
22
23         
24            if (map.containsKey(sum)) {
25
26                int length = i - map.get(sum);
27                maxLength = Math.max(maxLength, length);
28
29            } else {
30            
31                map.put(sum, i);
32            }
33        }
34
35        return maxLength;
36    }
37}