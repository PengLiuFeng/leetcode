package com.pengliufeng.leetcode.dynamicprograme;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author mr-peng
 * @since 2021-12-03
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 */
public class TranslateNum {

    @Test
    public void test(){
        translateNum(1068385902);
    }
    public int translateNum(int num) {
        if (num < 10){
            return 1;
        }
        List<Integer> context = new ArrayList<>();
        while (num / 10 > 0){
            context.add(num%10);
            num = num/10;
        }
        context.add(num);
        Collections.reverse(context);
        int[] dp = new int[context.size()];
        dp[0] = 1;
        for (int i = 1; i < context.size(); i++) {
            dp[i] = dp[i-1];

            if ((context.get(i) + context.get(i-1)*10) < 26 && (context.get(i) + context.get(i-1)*10) >= 10){
               if (i == 1){
                   dp[i]++;
               }else {
                   dp[i] = dp[i-1]+dp[i-2];
               }
            }
        }
        return dp[dp.length-1];
    }
}
