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

