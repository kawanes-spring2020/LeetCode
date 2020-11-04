package medium_complexity;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


public class AddTwoNumbers_LinkedList {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode p = l1, q = l2,curr = root;
        int val1 = 0;
        int val2 = 0;
        int sum = 0;
        int carry = 0;
        while(p!=null || q!=null){
            if(p!=null){
                val1 = p.val;
            }
            else{
                val1 = 0;
            }
            if(q!=null){
                val2 = q.val;
            }
            else{
                val2 = 0;
            }

            sum = carry + val1 + val2;
            carry = sum/10;

            ListNode temp = new ListNode(sum%10);
            curr.next = temp;
            curr = curr.next;

            if(p!=null) p = p.next;
            if(q!=null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return root.next;
    }
}
