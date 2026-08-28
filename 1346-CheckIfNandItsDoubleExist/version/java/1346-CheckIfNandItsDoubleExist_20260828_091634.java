// Last updated: 8/28/2026, 9:16:34 AM
1import java.util.*;
2
3class Solution {
4    public int maximumSetSize(int[] nums1, int[] nums2) {
5
6        int n = nums1.length;
7
8        HashSet<Integer> set1 = new HashSet<>();
9        HashSet<Integer> set2 = new HashSet<>();
10
11
12        for (int num : nums1) {
13            set1.add(num);
14        }
15
16        for (int num : nums2) {
17            set2.add(num);
18        }
19
20        int common = 0;
21
22        for (int num : set1) {
23            if (set2.contains(num)) {
24                common++;
25            }
26        }
27
28       
29        int only1 = set1.size() - common;
30        int only2 = set2.size() - common;
31
32        int half = n / 2;
33
34   
35        int take1 = Math.min(only1, half);
36        int take2 = Math.min(only2, half);
37
38       
39        int remaining1 = half - take1;
40        int remaining2 = half - take2;
41
42        int commonTaken = Math.min(common,
43                                   remaining1 + remaining2);
44
45        return take1 + take2 + commonTaken;
46    }
47}