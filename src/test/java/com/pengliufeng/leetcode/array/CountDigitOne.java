package com.pengliufeng.leetcode.array;

/**
 * @author mr-peng
 * @since 2021-12-30
 * <p>
 *   获取1到整数n中间所有整数中1出现的次数
 * </p>
 *
 */
public class CountDigitOne {

    public int countDigitOne(int n) {
        long k = 1 ;
        int ans = 0;
       while (k <= n){
           ans += (n/(k*10) * k) + Math.min(Math.max(n % (k*10) - k + 1, 0) , k);
           k *= 10;
        }
        return ans;
    }

}
