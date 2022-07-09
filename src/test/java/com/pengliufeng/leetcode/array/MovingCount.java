package com.pengliufeng.leetcode.array;

import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author mr-peng
 * @since 2021-12-07
 * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
 */
public class MovingCount {

    @Test
    public void test(){
        movingCount(3,1,0);
    }
    public int movingCount(int m, int n, int k) {
        int res = 0;
        Queue<int[]> queue = new LinkedList<>();
        //开始坐标
        int[] station = {0,0};
        //标示每个坐标是否被遍历过
        boolean[][] via = new boolean[m][n];
        via[0][0] = false;
        queue.offer(station);
        while (!queue.isEmpty()){
            int[] poll = queue.poll();
            if (poll[0] > m - 1 || poll[1] > n - 1 || via[poll[0]][poll[1]] || getSum(poll[0]) + getSum(poll[1]) > k){
                continue;
            }else {
                res++;
                via[poll[0]][poll[1]] = true;
            }
            int[] right = {poll[0]+1,poll[1]};
            int[] down = {poll[0],poll[1]+1};
            queue.offer(right);
            queue.offer(down);

        }
        return res;
    }

    int getSum(int a){
        int res = 0;
        while (a != 0){
            res += a%10;
            a = a/10;
        }
        return res;
    }
}
