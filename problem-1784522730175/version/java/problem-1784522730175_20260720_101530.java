// Last updated: 7/20/2026, 10:15:30 AM
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3
4        ListNode current = head;
5
6        while (current != null && current.next != null) {
7
8            if (current.val == current.next.val) {
9                current.next = current.next.next;
10            } else {
11                current = current.next;
12            }
13        }
14
15        return head;
16    }
17}