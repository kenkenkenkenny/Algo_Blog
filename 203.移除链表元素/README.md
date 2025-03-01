# **203.移除链表元素**

> 题目链接/文章讲解/视频讲解：：[https://programmercarl.com/0203.%E7%A7%BB%E9%99%A4%E9%93%BE%E8%A1%A8%E5%85%83%E7%B4%A0.html](https://programmercarl.com/0203.移除链表元素.html)



### 思路

* 解法1（原数组移除）：分情况讨论：当移除元素是head的时候，首先需要判断`head`是否为空，然后直接复制head = head.next. 当移除元素在链表之间的情况，需要定义`cur=head`指针，判断cur和`cur.next`是否为空，然后赋值`cur.next = cur.next.next`,如果cur不是需要移除的元素：`cur = cur.next`
* 解法2（dummyHead）：需要在head前面定义一个dummyHead，然后循环判断是否相等，然后再有`cur.next = cur.next.next`



#### Solution1 （原数组移除）

```java
/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
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
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null&&head.val==val){
            head = head.next;
        }
        ListNode cur = new ListNode();
        cur = head;
        while(cur!= null&& cur.next!= null){
            if(cur.next.val == val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }

        }
        return head;
    }
}
// @lc code=end


```

#### Solution2 （dummyHead）

```java
/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode cur = new ListNode();
        cur = dummyHead;
        while(cur.next!= null){
            if(cur.next.val == val){
                cur.next = cur.next.next;
            }
            else{
                cur = cur.next;
            }
        }
        return head;
    }
    
}
// @lc code=end


```

