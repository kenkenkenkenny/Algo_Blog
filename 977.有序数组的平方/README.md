# 977.有序数组的平方

> 题目链接：https://leetcode.cn/problems/squares-of-a-sorted-array/
>
> 文章讲解：[https://programmercarl.com/0977.%E6%9C%89%E5%BA%8F%E6%95%B0%E7%BB%84%E7%9A%84%E5%B9%B3%E6%96%B9.html](https://programmercarl.com/0977.有序数组的平方.html)
>
> 视频讲解： https://www.bilibili.com/video/BV1QB4y1D7ep



### 思路

* 双指针-- 一左一右，指针往中间靠拢，比较左右平方以后的大小，大的赋值到新的数组，并且更新指针（向中间靠拢left++，right--）

#### Solution 

```java
/*
 * @lc app=leetcode.cn id=977 lang=java
 *
 * [977] 有序数组的平方
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        for(int i = nums.length -1; i >= 0; i--){
            if(nums[left]*nums[left]>nums[right]*nums[right]){
                res[i] = nums[left]*nums[left];
                left++;

            }else {
                res[i] = nums[right] * nums[right];
                right--;
            }
            

        }
        return res;
    }
}
// @lc code=end


```



