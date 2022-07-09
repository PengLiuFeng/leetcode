package com.pengliufeng.leetcode.array;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * @author mr-peng
 * @since 2021-12-20
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 */
public class GetLeastNumber {
    /**
     * 用堆的方式进行排序
     * @param arr
     * @param k
     * @return
     */
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] result = new int[k];
        PriorityQueue<Integer> query = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < k; i++) {
            query.offer(arr[i]);
        }
        for (int i = k ; i < arr.length ; i++){
            if (query.peek() > arr[i]) {
                query.poll();
                query.offer(arr[i]);
            }
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = query.poll();
        }
        return result;
    }
}
