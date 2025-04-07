/**
 * Time : O(N); Space : O(1)
 * @tag : Linked List; Math
 * @by  : Steven Cooks
 * @date: Jul 15, 2015
 *******************************************************************************
 * Description: 
 * 
 * You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain 
 * l1 single digit. Add the two numbers and return it as l1 linked list. 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) 
 * Output: 7 -> 0 -> 8
 * 
 *******************************************************************************
 * Similar to Leetcode[067]
 * {@link https://leetcode.com/problems/add-two-numbers/ }
 */
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
