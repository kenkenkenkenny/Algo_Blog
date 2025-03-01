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
      return reverse(null,head);
       

        
    }

    public ListNode reverse(ListNode pre, ListNode cur) {
      if(cur == null){
        return pre;
      }
      
       ListNode tmp = new ListNode();
        tmp = cur.next;
        cur.next = pre;
        return reverse(cur,tmp);
        
      
        
    }


}
// @lc code=end

