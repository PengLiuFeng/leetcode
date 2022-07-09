package com.pengliufeng.leetcode.array;

import org.junit.Test;

/**
 * @author mr-peng
 * @since 2021-12-05
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分。
 */
public class Exchange {

    @Test
    public void test(){
        int[] param = {1,2,3,4,6,9,5};
        exchange(param);
    }

    public int[] exchange(int[] nums) {
        int oddIndex = 0;
        int mulIndex = 0;
        int numslength = nums.length;
        while (mulIndex < numslength && oddIndex < numslength){
            if (oddIndex == mulIndex){
                if (nums[oddIndex] % 2 == 1 ) mulIndex += 1;
            }else if (nums[oddIndex] % 2 == 1){
                int temp = nums[oddIndex];
                nums[oddIndex] = nums[mulIndex];
                nums[mulIndex] = temp;
                mulIndex++;
            }
            oddIndex += 1 ;
        }
        return nums;
    }
}
