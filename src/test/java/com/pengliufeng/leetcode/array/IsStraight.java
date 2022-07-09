package com.pengliufeng.leetcode.array;

import java.util.Arrays;

/**
 * @author mr-peng
 * @since 2021-12-20
 * 从若干副扑克牌中随机抽 5 张牌，判断是不是一个顺子，即这5张牌是不是连续的。2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
 */
public class IsStraight {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int lz = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                lz++;
                continue;
            }
            if (nums[i+1] == nums[i] + 1 && nums[i] < 14){
                continue;
            }else if (nums[i+1] == nums[i] || (nums[i+1] - nums[i] - 1) > lz ){
                return false;
            }else {
                lz -= (nums[i+1] - nums[i] - 1);
            }
        }
        return true;
    }
}
