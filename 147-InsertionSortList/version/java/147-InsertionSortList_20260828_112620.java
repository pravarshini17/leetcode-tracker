// Last updated: 8/28/2026, 11:26:20 AM
1class Solution {
2    public ListNode insertionSortList(ListNode head) {
3
4    
5        ListNode dummy = new ListNode(0);
6
7        ListNode curr = head;
8
9        while (curr != null) {
10
11          
12            ListNode next = curr.next;
13
14          
15            ListNode prev = dummy;
16
17    
18            while (prev.next != null && prev.next.val < curr.val) {
19                prev = prev.next;
20            }
21
22            curr.next = prev.next;
23            prev.next = curr;
24
25            curr = next;
26        }
27
28        return dummy.next;
29    }
30}