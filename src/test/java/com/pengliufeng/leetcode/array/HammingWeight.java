package com.pengliufeng.leetcode.array;

public class HammingWeight {
    public int hammingWeight(int n) {
        n = Math.abs(n);
        int res = 0;
        while (n > 0){
            if (n % 2 == 1){
                res++;
            }
            res = n/2;
        }
        return  res;
    }

    public int add(int a , int b ){

        while (b != 0){
            int c = (a&b) << 1;
            a ^= b;
            b = c;
        }

        return a;
    }
}
