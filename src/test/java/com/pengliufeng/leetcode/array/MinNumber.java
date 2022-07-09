package com.pengliufeng.leetcode.array;

import java.util.Arrays;

/**
 * @author mr-peng
 * @since 2021-12-20
 * 输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 */
public class MinNumber {

    public String minNumber(int[] nums) {
        String[] numString = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numString[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(numString,(x,y) -> (y+x).compareTo(x+y));
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : numString) {
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }
}
