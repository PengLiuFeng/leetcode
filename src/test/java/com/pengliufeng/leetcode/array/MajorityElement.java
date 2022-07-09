package com.pengliufeng.leetcode.array;

/**
 * @author mr-peng
 * @since 2021-12-23
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 */
public class MajorityElement {

    /**
     * 阶梯思路使用的摩尔投票法
     * 假设当前的数是众数，+1 ，不是-1；最后大于0的为众数
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int x = 0 ,votes = 0;
        for (int num : nums) {
            if (votes == 0) x = num;
            votes += x == num ? 1 : -1;
        }
        return x;
    }
}
