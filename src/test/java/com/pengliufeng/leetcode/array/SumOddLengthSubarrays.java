package com.pengliufeng.leetcode.array;

import org.junit.Test;

public class SumOddLengthSubarrays {

    @Test
    public void test(){
        int[] arr = {1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(arr));
    }

    public int sumOddLengthSubarrays(int[] arr) {
        int sumTotal = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = i; i1 < arr.length ; i1 += 2 ) {
                for (int j = i ; j <= i1 ; j++){
                    sumTotal += arr[j];
                }
            }
        }
        return sumTotal;
    }
}
