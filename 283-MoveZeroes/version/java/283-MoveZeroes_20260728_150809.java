// Last updated: 7/28/2026, 3:08:09 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int index = 0;
4
5        for (int i = 0; i < nums.length; i++) {
6            if (nums[i] != 0) {
7                nums[index] = nums[i];
8                index++;
9            }
10        }
11
12        while (index < nums.length) {
13            nums[index] = 0;
14            index++;
15        }
16    }
17}