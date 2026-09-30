// Last updated: 9/30/2026, 9:23:50 AM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> permute(int[] nums) {
5        List<List<Integer>> result = new ArrayList<>();
6        boolean[] used = new boolean[nums.length];
7
8        backtrack(nums, used, new ArrayList<>(), result);
9
10        return result;
11    }
12
13    private void backtrack(int[] nums, boolean[] used,
14                            List<Integer> current,
15                            List<List<Integer>> result) {
16
17
18        if (current.size() == nums.length) {
19            result.add(new ArrayList<>(current));
20            return;
21        }
22
23 
24        for (int i = 0; i < nums.length; i++) {
25
26            if (used[i]) {
27                continue;
28            }
29
30            current.add(nums[i]);
31            used[i] = true;
32
33       
34            backtrack(nums, used, current, result);
35
36            current.remove(current.size() - 1);
37            used[i] = false;
38        }
39    }
40}