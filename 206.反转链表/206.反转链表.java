/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
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
    public ListNode reverseList(ListNode head) {
        ListNode pre = new ListNode();
        ListNode cur = new ListNode();
        pre = null;
        cur = head;
        while(cur != null){
             ListNode tmp = new ListNode();
             tmp = cur.next;
             cur.next = pre;
             pre = cur;
             cur = tmp;
        }
        return pre;

        
    }
}
// @lc code=end

