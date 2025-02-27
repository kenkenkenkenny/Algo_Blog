# **209.长度最小的子数组**

> 题目链接：https://leetcode.cn/problems/minimum-size-subarray-sum/
>
> 文章讲解：[https://programmercarl.com/0209.%E9%95%BF%E5%BA%A6%E6%9C%80%E5%B0%8F%E7%9A%84%E5%AD%90%E6%95%B0%E7%BB%84.html](https://programmercarl.com/0209.长度最小的子数组.html)
>
> 视频讲解：https://www.bilibili.com/video/BV1tZ4y1q7XE



### 思路

* 滑动窗口--满足单调性（也就是左右指针都往一个方向走且不会回头），收缩就是去掉不需要的元素滑动窗口实际上是双层遍历的优化版本，而双指针其实只有一层遍历，只不过是从头尾开始遍历的。
* 滑动窗口的原理是右边先开始走，然后直到窗口内值的总和大于target，此时就开始缩圈，缩圈是为了找到最小值，只要此时总和还大于target，我就一直缩小，缩小到小于target为止在这过程中不断更新最小的长度值，然后右边继续走，如此反复，直到右边碰到边界。这样就保证了可以考虑到最小的情况
* ![截屏2025-02-27 21.36.59](https://p.ipic.vip/nxjaud.png)



#### Solution

```java
/*
 * @lc app=leetcode.cn id=209 lang=java
 *
 * [209] 长度最小的子数组
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int i = 0;
        int sum = 0;

        for(int j = 0;j < nums.length;j++){
            sum += nums[j];
            while(sum >= target){
                int subLength = j - i +1;
                result = Math.min(result,subLength);
                sum = sum - nums[i];
                i++;

            }
        }
        return  result == Integer.MAX_VALUE ? 0 : result;
        
    }
}
// @lc code=end


```



