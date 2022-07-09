package com.pengliufeng.leetcode.array;

/**
 * @author mr-peng
 * @since 2021-12-23
 * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
 */
public class SingleNumbers {
    public int[] singleNumbers(int[] nums) {
            int res = 0;
            for (int num : nums) {
                res ^= num;
            }
            int dev = 1;
            while ((dev & res) == 0){
                dev <<= 1;
            }
            int a = 0 , b = 0;
            for (int num : nums) {
                if ((dev & num) != 0 ){
                    a ^= num;
                }else {
                    b ^= num;
                }
            }
            return new int[]{a,b};
    }

    /**
     * 其他的元素出现三次，找到只出现一次的
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for(int num : nums){
            ones = ones ^ num & ~twos;
            twos = twos ^ num & ~ones;
        }
        return ones;
    }
}
