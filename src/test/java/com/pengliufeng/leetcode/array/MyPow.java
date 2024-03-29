package com.pengliufeng.leetcode.array;

import org.junit.Test;

/**
 * @author mr-peng
 * @since 2021-12-22
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。不得使用库函数，同时不需要考虑大数问题
 */
public class MyPow {

    @Test
    public void test(){
        myPow(2.0000,10);
    }

    public double myPow(double x, int n) {
        if (n == 0 || x == 1){
            return 1;
        }
        if (x == 0){
            return 0;
        }
        long b = n;
        if (b < 0){
            x = 1 / x;
            b = -b;
        }
        double res = 1.0 ;
        while (b > 0){
            if ((b & 1) == 1) res *= x;
            x *= x;
            b >>= 1;
        }
        return res;
    }
}
