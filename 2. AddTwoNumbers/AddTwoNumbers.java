/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode temp = null;
        int carry = 0;
        while (l1 != null | l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            ListNode resultant = new ListNode(sum % 10);
            System.out.println("resultant: " + resultant.val);
            carry = sum / 10;
            System.out.println("carry: " + carry);

            if (temp == null) temp = head = resultant;
            else {
                temp.next = resultant;
                temp = temp.next;
            }
        }
        if (carry > 0) 
            temp.next = new ListNode(carry);
        return head;
    }
}
// @lc code=end

