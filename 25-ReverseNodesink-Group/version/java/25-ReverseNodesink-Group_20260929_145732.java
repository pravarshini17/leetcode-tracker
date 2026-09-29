// Last updated: 9/29/2026, 2:57:32 PM
1class Solution {
2    public ListNode reverseKGroup(ListNode head, int k) {
3
4        ListNode current = head;
5
6        for (int i = 0; i < k; i++) {
7            if (current == null) {
8                return head;
9            }
10            current = current.next;
11        }
12
13        ListNode prev = null;
14        current = head;
15
16        for (int i = 0; i < k; i++) {
17            ListNode next = current.next;
18            current.next = prev;
19            prev = current;
20            current = next;
21        }
22
23        head.next = reverseKGroup(current, k);
24
25        return prev;
26    }
27}