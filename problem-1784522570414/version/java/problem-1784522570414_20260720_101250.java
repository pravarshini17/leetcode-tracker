// Last updated: 7/20/2026, 10:12:50 AM
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3
4        ListNode dummy = new ListNode(0);
5        dummy.next = head;
6
7        ListNode prev = dummy;
8
9        while (head != null) {
10
11            // Duplicate found
12            if (head.next != null && head.val == head.next.val) {
13
14                // Skip all nodes with same value
15                while (head.next != null && head.val == head.next.val) {
16                    head = head.next;
17                }
18
19                // Remove duplicates
20                prev.next = head.next;
21            } else {
22                // Move prev only if current node is unique
23                prev = prev.next;
24            }
25
26            head = head.next;
27        }
28
29        return dummy.next;
30    }
31}