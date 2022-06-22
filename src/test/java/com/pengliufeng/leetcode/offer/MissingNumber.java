/**
 * OPay Inc.
 * Copyright (c) 2016-2022 All Rights Reserved.
 */
package com.pengliufeng.leetcode.offer;

/**
 * @author liufeng.peng
 * @version $Id: MissingNumber.java, v 0.1 2022-06-14 12:00 liufeng.peng Exp $$
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {
        int start = 0;
        int end = nums.length - 1 ;

        while (start < end){
            int middle = (end + start + 1 ) / 2;
            if (nums[middle] > middle) end = middle;
            if (nums[middle] <= middle) start = middle + 1;
        }
        return nums[start] == start ? nums.length : start;
    }
}