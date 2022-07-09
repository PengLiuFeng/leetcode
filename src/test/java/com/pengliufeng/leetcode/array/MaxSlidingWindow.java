package com.pengliufeng.leetcode.array;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

/**
 * @author mr-peng
 * @since 2021-12-26
 *
 */
public class MaxSlidingWindow {

    @Test
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 0){
            return new int[0];
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] != o2[0] ? o2[0] - o1[0] : o2[1] - o1[1];
            }
        });

        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < k; i++) {
            queue.offer(new int[]{nums[i] , i});
        }
        int index = 0;
        res[index] = queue.peek()[0];
        for (int i = k; i < nums.length; i++) {
            queue.offer(new int[]{nums[i],i});
            while (queue.peek()[1] < (i - k + 1)){
                queue.poll();
            }
            res[++index] = queue.peek()[0];
        }

        return res;
    }
}
