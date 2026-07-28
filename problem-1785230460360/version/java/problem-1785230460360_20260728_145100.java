// Last updated: 7/28/2026, 2:51:00 PM
1class Solution {
2    public boolean uniqueOccurrences(int[] arr) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4
5        for (int num : arr) {
6            map.put(num, map.getOrDefault(num, 0) + 1);
7        }
8
9        HashSet<Integer> set = new HashSet<>();
10
11        for (int freq : map.values()) {
12            if (set.contains(freq)) {
13                return false;
14            }
15            set.add(freq);
16        }
17
18        return true;
19    }
20}