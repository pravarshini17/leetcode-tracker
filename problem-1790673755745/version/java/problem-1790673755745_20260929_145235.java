// Last updated: 9/29/2026, 2:52:35 PM
1class Solution {
2    public ListNode swapPairs(ListNode head) {
3
4        ListNode dummy = new ListNode(0);
5        dummy.next = head;
6
7        ListNode current = dummy;
8
9        while (current.next != null && current.next.next != null) {
10
11            ListNode first = current.next;
12            ListNode second = current.next.next;
13
14            first.next = second.next;
15            second.next = first;
16            current.next = second;
17
18            current = first;
19        }
20
21        return dummy.next;
22    }
23}