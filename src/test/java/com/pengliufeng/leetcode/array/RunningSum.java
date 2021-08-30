package com.pengliufeng.leetcode.array;


import org.junit.Test;

public class RunningSum {

    @Test
    public void test(){
        int[] param = {3};
        runningSum(param);
        for (int i : param) {
            System.out.println(i);
        }
    }

    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
