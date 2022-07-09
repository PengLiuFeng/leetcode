package com.pengliufeng.leetcode.array;

import org.apache.logging.log4j.util.Strings;
import org.junit.Test;

/**
 * @author mr-peng
 * @since 2021-12-29
 * 请实现一个函数用来匹配包含'. '和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（含0次）。在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但与"aa.a"和"ab*a"均不匹配。
 *
 */
public class IsMatch {

    @Test
    public void test(){
        isMatch("ab",".*");
    }
    public boolean isMatch(String s, String p) {
        if (s == null || s.length() == 0 || p == null || p.length() == 0){
            return false;
        }
        char[] chars = s.toCharArray();
        char[] charp = p.toCharArray();
        int sIndex = 0 ;
        int pIndex = 0 ;
        while (sIndex < chars.length && pIndex < charp.length){
            if (chars[sIndex] == charp[pIndex] || charp[pIndex] == '.'){
                sIndex++;
                pIndex++;
            }else if (charp[pIndex] == '*' ){
                if (pIndex == 0) return false;
                if (charp[pIndex - 1] != chars[sIndex] && charp[pIndex - 1] != '.') pIndex++;
                else sIndex++;
                if (sIndex == chars.length && pIndex == charp.length - 1) pIndex++;
            }else if (chars[sIndex] != charp[pIndex] && pIndex < charp.length - 1 && charp[pIndex + 1] == '*'){
                pIndex += 2;
            }else{
                return false;
            }
        }
        return sIndex == chars.length  && pIndex == charp.length;
    }
}
