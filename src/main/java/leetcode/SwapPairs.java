package leetcode;

import leetcode.AddTwoNumbers.ListNode;

public class SwapPairs {
  public ListNode swapPairs(ListNode head) {
    if (head == null || head.next == null) return head;

    ListNode p = head;
    ListNode q = null;
    ListNode pre = null;
    // last one, check if p.next == null before swap
    while (p != null && p.next != null) {
      if (pre == null) {
        head = p.next;
      } else {
        pre.next = p.next;
      }
      q = p.next;
      p.next = p.next.next;
      q.next = p;

      pre = p;
      p = p.next;
    }

    return head;
  }

}
