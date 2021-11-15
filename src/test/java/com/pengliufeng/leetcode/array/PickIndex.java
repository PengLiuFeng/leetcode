package com.pengliufeng.leetcode.array;

import java.util.Random;

public class PickIndex {

    int sum = 0 ;
    double[] pick;
    public PickIndex(int[] w) {
        for (int i : w) {
            sum += i;
        }
        pick = new double[w.length];
        int indexSum = 0 ;
        for (int i = 0; i < w.length; i++) {
            pick[i] = Double.valueOf(indexSum + w[i]).doubleValue() / Double.valueOf(sum).doubleValue();
        }
        
    }

    public int pickIndex() {
        double pickDouble = Math.random();
        for (int i = 0; i < pick.length; i++) {
            if (pick[i] >= pickDouble){
                return i ;
            }
        }
        return -1;
    }
}
