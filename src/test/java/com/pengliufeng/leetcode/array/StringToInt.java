package com.pengliufeng.leetcode.array;

import org.apache.logging.log4j.util.Strings;
import org.junit.Test;

/**
 * @author mr-peng
 * @since
 * 写一个函数 StrToInt，实现把字符串转换成整数这个功能。不能使用 atoi 或者其他类似的库函数。
 */
public class StringToInt {

    @Test
    public void test(){
        strToInt("-91283472332");
    }

    public int strToInt(String str) {
        str = str.trim();
        char[] chars = str.toCharArray();
        int length = chars.length;
        if (length == 0){
            return 0;
        }
        boolean isPositive = chars[0] != '-' && chars[0] != '+';
        StringBuilder stringBuilder = new StringBuilder();
        if (!isPositive) stringBuilder.append(chars[0]);
        for (int i = isPositive ? 0 : 1; i < length ; i++){
            if ( chars[i] <= '9' && chars[i] >='0'){
                stringBuilder.append(chars[i]);
            }else {
                break;
            }
        }
        if ("".equals(stringBuilder.toString()) || "-".equals(stringBuilder.toString()) || "+".equals(stringBuilder.toString())){
            return 0;
        }
        chars = stringBuilder.toString().toCharArray();
        long res = 0 ;
        for (int i = chars.length - 1 ; i >=  (isPositive ? 0 : 1); i--) {
            Double thisNumber = Math.pow(10,chars.length - 1 - i)*Integer.valueOf(chars[i] - '0');
            if (thisNumber > Integer.MAX_VALUE || (thisNumber + res) > Integer.MAX_VALUE){
                return chars[0] == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            res += thisNumber;
        }
        if (chars[0] == '-'){
            res = 0 - res;
        }
        return res < Integer.MIN_VALUE ? Integer.MIN_VALUE : (int) res;
    }
}
