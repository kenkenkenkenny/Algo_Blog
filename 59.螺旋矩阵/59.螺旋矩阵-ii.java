/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int startX = 0;
        int startY = 0;
        int count = 1;
        int offset = 1;
        int loop = 0;
        int i,j;

        while(loop < n/2){
            // top
            for (j = startY; j < n - offset; j++){
                res[startX][j] = count++;
            }
            // right
            for(i = startX; i < n - offset;i++){
                res[i][j] = count++;
            }
            //bottom
            for(; j > startX; j--){
                res[i][j] = count++;
            }
            //left
            for(;i > startY;i--){
                res[i][j] = count++;
            }
            startX ++;
            startY++;
            offset ++;
    
            loop++;
        }
        if(n %2 == 1){
            res[startX][startY] = count;
        }
        return res;

        
    }
}
// @lc code=end

