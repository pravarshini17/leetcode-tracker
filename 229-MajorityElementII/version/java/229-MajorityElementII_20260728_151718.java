// Last updated: 7/28/2026, 3:17:18 PM
1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        int candidate1 = 0, candidate2 = 0;
4        int count1 = 0, count2 = 0;
5
6        for (int num : nums) {
7            if (num == candidate1) {
8                count1++;
9            } else if (num == candidate2) {
10                count2++;
11            } else if (count1 == 0) {
12                candidate1 = num;
13                count1 = 1;
14            } else if (count2 == 0) {
15                candidate2 = num;
16                count2 = 1;
17            } else {
18                count1--;
19                count2--;
20            }
21        }
22
23        count1 = 0;
24        count2 = 0;
25
26        for (int num : nums) {
27            if (num == candidate1) {
28                count1++;
29            } else if (num == candidate2) {
30                count2++;
31            }
32        }
33
34        List<Integer> result = new ArrayList<>();
35
36        if (count1 > nums.length / 3) {
37            result.add(candidate1);
38        }
39
40        if (count2 > nums.length / 3) {
41            result.add(candidate2);
42        }
43
44        return result;
45    }
46}