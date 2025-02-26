/*
 * @lc app=leetcode.cn id=704 lang=java
 *
 * [704] 二分查找
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        
        // int l = 0;
        // int r = nums.length-1;
        // while (l <= r){
        //     int middle = (l+r) /2;
        //     if(nums[middle] > target){
        //         r = middle -1;
        //     }
        //     else if(nums[middle] < target){
        //         l = middle + 1;
        //     }
        //     else{
        //         return middle;
        //     }
            

        // }
        // return -1;

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
// @lc code=end



