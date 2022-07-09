package com.pengliufeng.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mr-peng
 * @since 2021-11-26
 */
public class FindRepeatNumber {

    public int findRepeatNumber(int[] nums) {
        Map<Integer,Integer> cacheMap = new HashMap<>();
        for (int num : nums) {
            if (cacheMap.containsKey(num)){
                return num;
            }
            cacheMap.put(num,Integer.MAX_VALUE);
        }
        return Integer.MAX_VALUE;
    }
}
