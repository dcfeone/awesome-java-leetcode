package _002_AddTwoNumbers;

import util.ListNode;

public class Solution {

    public ListNode addTwoNumbers(ListNode a, ListNode b) {
    ListNode dummy=new ListNode(0);
    ListNode cur=dummy;
    int carry=0;
    while(a!=null || b!=null||carry!=0){
      int val=(a!=null?a.val:0) + (b!=null?b.val:0) + carry;
      carry=val/10;
      val=val%10;
      cur.next=new ListNode(val);
      cur=cur.next;
      if(a!=null)a=a.next;
      if(b!=null)b=b.next;
    }
    return dummy.next;
    }



  
  
}
