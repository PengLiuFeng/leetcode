package com.pengliufeng.leetcode.array;

import org.junit.Test;

/**
 * @author mr-peng
 * @since 2021-11-25
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 *
 */
public class ReverseLeftWords {

    @Test
    public void retest(){
        String param = "abcdefg";
        reverseLeftWords(param,2);
    }

    public String reverseLeftWords(String s, int n) {
        if (n > s.length()){
            return "";
        }
        String head = s.substring(0, n);
        String body = s.substring(n);
        return  body+head;
    }
}
