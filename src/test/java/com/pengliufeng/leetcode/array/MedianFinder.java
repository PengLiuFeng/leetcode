package com.pengliufeng.leetcode.array;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author mr-peng
 * @since 2021-12-20
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
 */
public class MedianFinder {
    PriorityQueue<Integer> bigHeap, littleHeap;
    /** initialize your data structure here. */
    public MedianFinder() {
        bigHeap = new PriorityQueue();
        littleHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
    }

    public void addNum(int num) {
        if (bigHeap.size() != littleHeap.size()){
            littleHeap.offer(num);
            bigHeap.offer(littleHeap.poll());
        }else {
            bigHeap.offer(num);
            littleHeap.offer(bigHeap.poll());
        }
    }

    public double findMedian() {
        return bigHeap.size() == littleHeap.size() ? (littleHeap.peek().doubleValue() + bigHeap.peek().doubleValue())/2 : littleHeap.peek().doubleValue();
    }
}
