package com.pengliufeng.leetcode.array;

public class MinArray {

    public int minArray(int[] numbers) {
        int end = numbers.length - 1;
        int start = 0;
        while (start < end){
            int middle = start + (end - start)/2;
            if (numbers[middle] < numbers[end]){
                end = middle;
            }else if (numbers[middle] > numbers[end]){
                start = middle + 1;
            }else {
                end--;
            }
        }
        return numbers[start];
    }
}
