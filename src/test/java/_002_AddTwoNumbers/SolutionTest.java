package _002_AddTwoNumbers;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import util.ListNode;

public class SolutionTest {
  Solution solution = new Solution();
  @Test
  public void Test1() {
    int[] nums1 = { 2, 4, 3 };
    int[] nums2 = { 5, 6, 4 };
    ListNode a = ListNode.constructLinkedList(nums1);
    ListNode b = ListNode.constructLinkedList(nums2);
    ListNode actual = solution.addTwoNumbers(a, b);
    System.out.println(ListNode.toString(actual));
    int[] exps = { 7, 0, 8 };
    ListNode expected = ListNode.constructLinkedList(exps);
    System.out.println(ListNode.toString(expected));
    assertTrue(ListNode.isSameList(actual, expected));
  }

}
