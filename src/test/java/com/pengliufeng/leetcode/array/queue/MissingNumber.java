package com.pengliufeng.leetcode.array.queue;

import java.util.Queue;

/**
 * @author mr-peng
 * @since 2021-11-26
 * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {
       int startIndex = 0 ;
       int endIndex = nums.length - 1 ;
       while (startIndex < endIndex){
           int midIndex = startIndex + (endIndex - startIndex + 1)/2 ;
           if (nums[midIndex] == midIndex){
               startIndex = midIndex + 1;
           }else {
               endIndex = midIndex;
           }
       }
       return nums[endIndex] != endIndex ?  endIndex : nums.length;
    }
}
