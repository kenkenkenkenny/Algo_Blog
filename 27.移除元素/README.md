# 27.移除元素

> 题目链接：https://leetcode.cn/problems/remove-element/ 
>
> 文章讲解：[https://programmercarl.com/0027.%E7%A7%BB%E9%99%A4%E5%85%83%E7%B4%A0.html](https://programmercarl.com/0027.移除元素.html)
>
> 视频讲解：https://www.bilibili.com/video/BV12A4y1Z7LP 



### 思路

* 双指针 -- （fast 和slow）利用覆盖的原理，当`nums[fast] != val`的时候，进行slow替换成fast的元素，并且slow++。反之，fast继续循环，但是slow依然在原来val的位置，当下一次循环到不等于val的时候，slow将会被fast覆盖

#### Solution 

```java
/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int slow = 0;
        for(int fast =0; fast < nums.length; fast++){
            if(nums[fast] != val){
                nums[slow] = nums[fast];
                slow ++;
            }
        }
    
        return slow;
    }
}
// @lc code=end


```



