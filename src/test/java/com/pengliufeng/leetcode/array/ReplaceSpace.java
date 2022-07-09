package com.pengliufeng.leetcode.array;

import org.junit.Test;
import org.springframework.util.StringUtils;

/**
 * @author mr-peng
 * @since 2021-11-25
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */
public class ReplaceSpace {

    @Test
    public void retest(){
        String param = "We are happy.";
        replaceSpace(param);
    }

    public String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        StringBuffer result = new StringBuffer();
        for (char aChar : chars) {
            if (aChar == ' ') {
                result.append("%20");
            }else {
                result.append(aChar);
            }
        }
        return result.toString();
    }
}
