// Last updated: 8/28/2026, 9:13:14 AM
1import java.util.HashSet;
2
3class Solution {
4    public boolean checkIfExist(int[] arr) {
5        HashSet<Integer> set = new HashSet<>();
6
7        for (int num : arr) {
8            if (set.contains(num * 2) || 
9                (num % 2 == 0 && set.contains(num / 2))) {
10                return true;
11            }
12
13            set.add(num);
14        }
15
16        return false;
17    }
18}