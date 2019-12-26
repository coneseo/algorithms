package leetcode;

public class AddTwoNumbers {

  public static void main(String[] args) {
    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
    ListNode l1 = new ListNode(2);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(3);

    ListNode l2 = new ListNode(5);
    l2.next = new ListNode(6);
    l2.next.next = new ListNode(4);

    ListNode listNode = addTwoNumbers.addTwoNumbers(l1, l2);

    while(listNode != null){
      System.out.println(listNode.val);
      listNode = listNode.next;
    }
  }
   public static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode resultNode = null;
    ListNode nextNode = null;
    int carry = 0;
    while( l1 != null || l2 != null || carry > 0){
      int newVal = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
      carry = 0;
      if( newVal >= 10){ carry = 1; newVal = newVal - 10; }
      if( resultNode == null ){
        resultNode = new ListNode( newVal );
        nextNode = resultNode;
      }else {
        nextNode.next = new ListNode( newVal);
        nextNode = nextNode.next; }
      l1 = (l1 != null ? l1.next : null);
      l2 = (l2 != null ? l2.next : null);
    }
    return resultNode;

  }
}
