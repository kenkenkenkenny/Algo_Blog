# 206.反转链表

> 题目链接/文章讲解/视频讲解：[https://programmercarl.com/0206.%E7%BF%BB%E8%BD%AC%E9%93%BE%E8%A1%A8.html](https://programmercarl.com/0206.翻转链表.html) 



### 思路

* 双指针--定义一个pre和cur指针，`pre=null`和`cur=head` ,然后遍历链表，首先定义一个temp来存放cur.next，然后反转链表（`cur.next = pre`), 然后移动pre和cur。
* 

#### Solution1 （双指针）

```java
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


```



#### Solution2 (递归)

```java
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


```

