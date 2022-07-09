package com.pengliufeng.leetcode.array;
/**
 * @author mr-peng
 * @since 2021-12-05
 * 找出递增数组中两个和为target的数据。
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int[] result = new int[2];
        while (start < end){
            if (nums[start] + nums[end] == target){
                result[0] = nums[start];
                result[1] = nums[end];
                return result;
            }else if (nums[start] + nums[end] > target){
                end--;
            }else {
                start++;
            }
        }
        return result;
    }
}
