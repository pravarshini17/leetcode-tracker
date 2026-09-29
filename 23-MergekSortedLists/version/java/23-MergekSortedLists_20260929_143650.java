// Last updated: 9/29/2026, 2:36:50 PM
1import java.util.PriorityQueue;
2
3class Solution {
4
5    public ListNode mergeKLists(ListNode[] lists) {
6
7        PriorityQueue<ListNode> pq = new PriorityQueue<>(
8            (a, b) -> a.val - b.val
9        );
10
11        // Add first node of every list
12        for (ListNode list : lists) {
13            if (list != null) {
14                pq.add(list);
15            }
16        }
17
18        ListNode dummy = new ListNode(0);
19        ListNode current = dummy;
20
21        while (!pq.isEmpty()) {
22
23            // Get smallest node
24            ListNode smallest = pq.poll();
25
26            // Add it to result
27            current.next = smallest;
28            current = current.next;
29
30            // Add next node from the same list
31            if (smallest.next != null) {
32                pq.add(smallest.next);
33            }
34        }
35
36        return dummy.next;
37    }
38}