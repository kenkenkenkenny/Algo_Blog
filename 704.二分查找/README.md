# **704. 二分查找**

> 题目链接：https://leetcode.cn/problems/binary-search/
>
> 文章讲解：[https://programmercarl.com/0704.%E4%BA%8C%E5%88%86%E6%9F%A5%E6%89%BE.html](https://programmercarl.com/0704.二分查找.html)
>
> 视频讲解：https://www.bilibili.com/video/BV1fA4y1o715



### 思路

* 前提数组必须是有序的，并且数组中无重复元素。
* 注意定义区间问题和边界处理问题
* 有两种解法
  1. 左闭右闭 -- 因为可以取到右边区间，所以`r = nums.length -1`(如果 `r = nums.length`，那么 `nums[right]` 就会越界访问，因此 `r = nums.length - 1`，保证 `right` 的索引有效），while中 ’‘ ，因为`left == right`是有意义的（意味着数组的搜索范围缩小到了仅剩 **一个元素**，此时仍然有可能找到 `target`）,另外更新left和right时候，需要将`middle-1`(`middle` 这个索引已经被检查过了，`nums[middle]` 确定不是 `target`，因此 `middle` 及其不可能包含 `target` 的部分都可以排除。)
  2. 左闭右开 -- 因为取不到右边区间，所以`r = nums.length`. 之所以`while(left <right)`，是因为left == right会越界。更新right 需要等于middle，因为取不到右边，但是left需要等于middle+1



#### Solution 1（左闭右闭）

```java
class Solution {
    public int search(int[] nums, int target) {
        
        int l = 0;
        int r = nums.length-1;
        while (l <= r){
            int middle = (l+r) /2;
            if(nums[middle] > target){
                r = middle -1;
            }
            else if(nums[middle] < target){
                l = middle + 1;
            }
            else{
                return middle;
            }
           
        }
        return -1;
    }
}

```

#### Solution 2（左闭右开）

```java
class Solution {
    public int search(int[] nums, int target) {
        
        int l = 0;
        int r = nums.length;
        while (l < r){
            int middle = (l+r) /2;
            if(nums[middle] > target){
                r = middle;

            }
            else if(nums[middle] < target){
                l = middle;
            }
            else{
                return middle;
            }
            

        }
        return -1;
    }
}




```

