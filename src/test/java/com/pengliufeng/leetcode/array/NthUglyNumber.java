package com.pengliufeng.leetcode.array;

import org.junit.Test;

/**
 * @author mr-peng
 * @since 2021-12-29
 * <P>
 *     我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。
 * </P>
 */
public class NthUglyNumber {

    @Test
    public void test() {
        nthUglyNumber(11);
    }
    public int nthUglyNumber(int n) {
        int p2 = 0 , p3 = 0 , p5 = 0;
        int[] dp = new int[n];
        dp[0] = 1;

        for (int i = 1; i < n; i++) {
            int num2 = dp[p2]*2 , num3 = dp[p3]*3 , num5 = dp[p5]*5;
            int num = Math.min(Math.min( num2,num3),num5);
            dp[i] = num;
            if (num == num2){
                p2++;
            }
            if (num == num3){
                p3++;
            }
            if (num == num5){
                p5++;
            }

        }
        return dp[dp.length - 1];
    }
}
