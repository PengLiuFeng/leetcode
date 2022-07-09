package com.pengliufeng.leetcode.offer;

import java.util.ArrayList;
import java.util.List;

public class TranslateNum {
    public int translateNum(int num) {
        if (num < 10){
            return 1;
        }
        List<Integer> numList = new ArrayList<>();
        while (num > 0){
            numList.add(num % 10);
            num = num/10;
        }
        int[] dept = new int[numList.size()];
        dept[0] = 1;
        int first = numList.get(1)*10 + numList.get(0);
        dept[1] = (first < 26 && first > 9) ? 2 : 1;
        for (int i = 2; i < numList.size(); i++) {
            dept[i] = dept[i-1];
            int doubleNum = numList.get(i)*10 + numList.get(i-1);
            if (doubleNum >= 10 && doubleNum < 26){
                dept[i] = dept[i-1] + dept[i-2];
            }
        }
        return dept[dept.length - 1];
    }
}
