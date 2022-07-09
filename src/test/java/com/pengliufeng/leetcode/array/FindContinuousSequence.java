package com.pengliufeng.leetcode.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FindContinuousSequence {

    @Test
    public void test(){
        findContinuousSequence(15);
    }

    public int[][] findContinuousSequence(int target) {
        if (target < 1){
            return new int[0][0];
        }
        List<int[]> res = new ArrayList<>();
        int i = target;
        while (i >= 2){
            if ((target - (i-1)*i/2)%i == 0 && (target - (i-1)*i/2)/i > 0){
                res.add(buildArrat((target - (i-1)*i/2)/i , i));
            }
            i--;
        }
        int[][] result = new int[res.size()][];
        for (int i1 = 0; i1 < result.length; i1++) {
            result[i1] = res.get(i1);
        }
        return result;
    }

    private int[] buildArrat(int v, int i) {
        int[] result = new int[i];
        for (int i1 = 0; i1 < i; i1++) {
            result[i1] = v+i1;
        }
        return result;
    }
}
