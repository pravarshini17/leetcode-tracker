// Last updated: 9/29/2026, 3:02:19 PM
1import java.util.*;
2
3class Solution {
4    public List<Integer> findSubstring(String s, String[] words) {
5
6        List<Integer> result = new ArrayList<>();
7
8        int wordLength = words[0].length();
9        int wordCount = words.length;
10        int totalLength = wordLength * wordCount;
11
12        // Store required frequency of each word
13        Map<String, Integer> required = new HashMap<>();
14
15        for (String word : words) {
16            required.put(word, required.getOrDefault(word, 0) + 1);
17        }
18
19        for (int offset = 0; offset < wordLength; offset++) {
20
21            int left = offset;
22            int right = offset;
23            int count = 0;
24
25            Map<String, Integer> window = new HashMap<>();
26
27            while (right + wordLength <= s.length()) {
28
29                String word = s.substring(right, right + wordLength);
30                right += wordLength;
31
32                if (!required.containsKey(word)) {
33
34                    window.clear();
35                    count = 0;
36                    left = right;
37
38                } else {
39
40     
41                    window.put(word, window.getOrDefault(word, 0) + 1);
42                    count++;
43
44                    
45                    while (window.get(word) > required.get(word)) {
46
47                        String leftWord =
48                            s.substring(left, left + wordLength);
49
50                        window.put(
51                            leftWord,
52                            window.get(leftWord) - 1
53                        );
54
55                        left += wordLength;
56                        count--;
57                    }
58
59                    if (count == wordCount) {
60
61                        result.add(left);
62
63                        String leftWord =
64                            s.substring(left, left + wordLength);
65
66                        window.put(
67                            leftWord,
68                            window.get(leftWord) - 1
69                        );
70
71                        left += wordLength;
72                        count--;
73                    }
74                }
75            }
76        }
77
78        return result;
79    }
80}