package com.pengliufeng.leetcode.array;

import org.junit.Test;

import java.util.Arrays;

public class DicesProbability {


    @Test
    public void test() {
        dicesProbability(3);
    }

    public double[] dicesProbability(int n) {
        double[] dp = new double[6];
        Arrays.fill(dp,1.0/6.0);
        for (int i = 2; i <= n; i++) {
            double[] doubles = new double[5*i+1];
            for (int k = 0;  k< dp.length; k++) {
                for (int j = 0; j < 6; j++) {
                    doubles[j+k] += (dp[k]  / 6.0);
                }
            }

            dp = doubles;
        }
        return dp;
    }
}
