package com.pengliufeng.leetcode.dynamicprograme;

import org.junit.Test;

/**
 * @author mr-peng
 * @since 2021-12-01
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)
 *
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 */
public class Fib {
    @Test
    public void test(){
        System.out.println(frogStep(7));
    }

    public int fib(int n) {
        if (n < 2 ){
            return n;
        }
        return fib(n-1)%1000000007+ fib(n-2)%1000000007;
    }

    public int fibForeach (int n){
        if (n < 2 ){
            return n;
        }
        int result = 0;
        int last = 0;
        int next = 1;
        for (int i = 2 ; i <= n ; i++){
            result = last + next;
            int temp = next ;
            next = result;
            last = temp;
        }
        return result%1000000007;
    }

    public int frogStep (int n){
        if (n < 2){
            return 1;
        }
        int result = 0;
        int last = 1;
        int next = 1;
        for (int i = 2 ; i <= n ; i++){
            result = last%1000000007 + next%1000000007;
            int temp = next ;
            next = result;
            last = temp;
        }
        return result%1000000007;
    }

}
