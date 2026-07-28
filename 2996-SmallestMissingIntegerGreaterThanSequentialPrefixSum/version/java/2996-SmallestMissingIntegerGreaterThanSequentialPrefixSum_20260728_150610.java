// Last updated: 7/28/2026, 3:06:10 PM
1class Solution {
2    public int missingInteger(int[] nums) {
3        int sum = nums[0];
4
5        for (int i = 1; i < nums.length; i++) {
6            if (nums[i] == nums[i - 1] + 1) {
7                sum += nums[i];
8            } else {
9                break;
10            }
11        }
12
13        HashSet<Integer> set = new HashSet<>();
14        for (int num : nums) {
15            set.add(num);
16        }
17
18        while (set.contains(sum)) {
19            sum++;
20        }
21
22        return sum;
23    }
24}