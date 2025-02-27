# ** 59.螺旋矩阵II**


> 题目链接：https://leetcode.cn/problems/spiral-matrix-ii/
>
>文章讲解：https://programmercarl.com/0059.%E8%9E%BA%E6%97%8B%E7%9F%A9%E9%98%B5II.html
>
>视频讲解：https://www.bilibili.com/video/BV1SL4y1N7mV/
>




### 思路

* <img src="https://p.ipic.vip/gknyb0.png" alt="截屏2025-02-27 21.38.19" style="zoom:30%;" />
* 定义（StartX，StartY代表坐标，offset代表不会访问到一条边最后一个元素，loop代表圈数（n/2）
* 如果n是奇数的话，中间应该单独赋值
* 顺序
  * 填充上行从左到右（startX不变，j（列）变）
  * 填充右列从上到下（循环StartX）
  * 填充下行从右到左
  * 填充左列从下到上

* 



#### Solution

```java
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


```



