package com.pengliufeng.leetcode.dynamicprograme;

import org.junit.Test;

/**
 * @author mr-peng
 * @since 2021-12-06
 * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
 */
public class MovingCount {

    @Test
    public void test(){
        movingCount(16,16,2);
    }

    public int movingCount(int m, int n, int k) {
        int i = 0;
        int j = 0;
        int sum = 0;
        while (i < m && k >= i){
            if (numberSum(i,j) > k){
                i++;
                j = 0;
            }else if (j == n-1){
                sum++;
                i++;
                j = 0;
            } else {
                j++;
                sum++;
            }

        }
        return sum;
    }
    public int numberSum(int i , int j){
        int result = 0;
        while (i > 0 || j > 0){
            result += i%10;
            result += j%10;
            if (i > 0)  i = i/10;
            if (j > 0)  j = j/10;
        }
        return result;
    }
}
