// Last updated: 8/28/2026, 11:38:38 AM
1class Solution {
2    public ListNode middleNode(ListNode head) {
3
4        ListNode slow = head;
5        ListNode fast = head;
6
7        while (fast != null && fast.next != null) {
8            slow = slow.next;
9            fast = fast.next.next;
10        }
11
12        return slow;
13    }
14}