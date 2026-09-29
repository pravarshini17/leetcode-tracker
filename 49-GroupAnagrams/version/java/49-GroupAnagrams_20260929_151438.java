// Last updated: 9/29/2026, 3:14:38 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3
4        Map<String, List<String>> map = new HashMap<>();
5
6        for (String str : strs) {
7
8            // Convert string to character array
9            char[] chars = str.toCharArray();
10
11            // Sort the characters
12            Arrays.sort(chars);
13
14            // Sorted string becomes the key
15            String key = new String(chars);
16
17            // Add original string to its group
18            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
19        }
20
21        return new ArrayList<>(map.values());
22    }
23}