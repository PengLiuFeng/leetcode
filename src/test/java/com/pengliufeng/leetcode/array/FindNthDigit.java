package com.pengliufeng.leetcode.array;

import org.junit.Test;

public class FindNthDigit {

    @Test
    public void test(){
        findNthDigit(100);
    }
    public int findNthDigit(int n) {
        long start = 1;
        int dis = 1;
        long count = 9;
        while (n > count){
            n -= count;
            dis++;
            start *= 10;
            count = start*dis*9;
        }
        Long num = start + (n-1) / dis;
        return Long.toString(num).toCharArray()[(n-1)%dis] - '0';

    }
}
