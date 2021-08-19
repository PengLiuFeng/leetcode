package com.pengliufeng.leetcode.array;

import org.json.JSONObject;
import org.junit.Test;
import org.junit.platform.commons.logging.LoggerFactory;
import org.omg.CORBA.INTERNAL;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。
 * <p>
 * 解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列。
 */

@SpringBootTest
public class SubsetsWithDupTest {

    @Test
    public void subsetsWithDupTest() {
        int[] param = {1, 2, 3, 4};
        subsetsWithDup(param);
    }


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if (nums == null) {
            return Collections.EMPTY_LIST;
        }
        int numsLength = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>(Collections.emptyList());

        for (int slow = 0; slow < numsLength; slow++) {
            int fast = slow;

            List<Integer> singleArray = new ArrayList<>();
            singleArray.add(nums[slow]);

            while (fast++ < numsLength) {

            }
        }
        return result;


    }
}
