# 707.设计链表

> 题目链接/文章讲解/视频讲解：[https://programmercarl.com/0707.%E8%AE%BE%E8%AE%A1%E9%93%BE%E8%A1%A8.html](https://programmercarl.com/0707.设计链表.html)



### 思路

* 首先需要定义ListNode类和size和dummyNode

#### Solution 

```java
/*
 * @lc app=leetcode.cn id=707 lang=java
 *
 * [707] 设计链表
 */

// @lc code=start
class MyLinkedList {

    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){this.val = val;};
        ListNode(int val, ListNode next){this.val = val; this.next= next;};
    }

    private int size;
    private ListNode dummyHead;

    public MyLinkedList() {
        this.size = 0;
        this.dummyHead = new ListNode(0);
        
    }
    
    public int get(int index) {
        if(index < 0 || index > size -1 ){return -1;}

        ListNode cur = dummyHead;
        for(int i = 0; i <= index;i++){
            cur = cur.next;
        }
        return cur.val;


        
    }
    
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = dummyHead.next;
        dummyHead.next = newNode;
        size +=1;
        
    }
    
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    public void addAtIndex(int index, int val) {
         if (index < 0) index = 0;
        if (index > size) return;
            ListNode newNode = new ListNode(val);
          ListNode cur = dummyHead;
          for(int i = 0; i<= index-1;i++){
            cur = cur.next;
         }
         newNode.next = cur.next;
         cur.next = newNode;
         size +=1;


        
    }
    

    public void deleteAtIndex(int index) {
         if(index < 0 || index > size -1 ){return;}
          ListNode cur = dummyHead;
          for(int i = 0; i<= index-1;i++){
            cur = cur.next;
         }
         cur.next = cur.next.next;
         size -=1;
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
// @lc code=end


```



