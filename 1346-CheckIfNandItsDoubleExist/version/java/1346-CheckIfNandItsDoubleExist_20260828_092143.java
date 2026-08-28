// Last updated: 8/28/2026, 9:21:43 AM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> findWinners(int[][] matches) {
5
6        HashMap<Integer, Integer> losses = new HashMap<>();
7
8      
9        for (int[] match : matches) {
10
11            int winner = match[0];
12            int loser = match[1];
13
14           
15            if (!losses.containsKey(winner)) {
16                losses.put(winner, 0);
17            }
18
19            
20            losses.put(loser, losses.getOrDefault(loser, 0) + 1);
21        }
22
23        List<Integer> zeroLoss = new ArrayList<>();
24        List<Integer> oneLoss = new ArrayList<>();
25
26     
27        for (int player : losses.keySet()) {
28
29            int count = losses.get(player);
30
31            if (count == 0) {
32                zeroLoss.add(player);
33            }
34            else if (count == 1) {
35                oneLoss.add(player);
36            }
37        }
38
39        
40        Collections.sort(zeroLoss);
41        Collections.sort(oneLoss);
42
43        List<List<Integer>> answer = new ArrayList<>();
44
45        answer.add(zeroLoss);
46        answer.add(oneLoss);
47
48        return answer;
49    }
50}