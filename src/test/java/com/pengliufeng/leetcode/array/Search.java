package com.pengliufeng.leetcode.array;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author mr-peng
 * @since 2021-11-26
 * 统计一个数字在排序数组中出现的次数
 */
public class Search {
    @Test
    public void test(){
        int[] array = {5,7,7,8,8,10};
        search(array,6);
    }

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int firstShowArrayIndex = findFirstShow(nums,target);
        if (firstShowArrayIndex == -1){
            return 0;
        }
        int lastShowArrayIndex = findLastShow(nums,target);
        return lastShowArrayIndex - firstShowArrayIndex + 1 ;
    }

    private int findLastShow(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;
        while (startIndex < endIndex){
            int middleIndex = startIndex + (endIndex - startIndex + 1)/2;
            if (nums[middleIndex] <= target){
                startIndex = middleIndex ;
            }else {
                endIndex = middleIndex - 1;
            }
        }
        return nums[startIndex] == target ? startIndex : -1 ;
    }

    private int findFirstShow(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;
        while (startIndex < endIndex){
            int middleIndex = startIndex + (endIndex - startIndex)/2;
            if (nums[middleIndex] >= target){
                endIndex = middleIndex ;
            }else {
                startIndex = middleIndex + 1 ;
            }
        }
        return nums[startIndex] == target ? startIndex : -1 ;
    }
}
