package com.pengliufeng.leetcode.dynamicprograme;

import org.junit.Test;

/**
 * @author mr-peng
 * @since 2022-02-09
 * <p>
 *     给你一个 只包含正整数 的 非空 数组 nums 。请你判断是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
 * </p>
 * <p>
 *     解题思路：动态规划
 * </p>
 */
public class CanPartition {

    @Test
    public void test(){
        canPartition(new int[]{1,2,3,6});
    }

    public boolean canPartition(int[] nums) {
        int n = nums.length;
        if(n < 2){
            return false;
        }
        int sum = 0;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxValue = Math.max(maxValue,nums[i]);
        }
        if (sum % 2 != 0){
            return false;
        }
        int target = sum/2 ;
        if (target < maxValue) {
            return false;
        }

        boolean[][] dp = new boolean[n][target+1];
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }
        dp[0][nums[0]] = true;
        for (int i = 1; i < n; i++) {
            int num = nums[i];
            for (int j = 1; j < target+1; j++) {
               if (j >= num){
                   dp[i][j] = dp[i-1][j] | dp[i-1][j - num];
               }else {
                   dp[i][j] = dp[i-1][j];
               }
            }

        }
        return dp[n-1][target];
    }
}
