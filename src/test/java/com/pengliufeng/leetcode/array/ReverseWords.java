package com.pengliufeng.leetcode.array;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author mr-peng
 * @since 2021-12-05
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，则输出"student. a am I"
 */
public class ReverseWords {
    @Test
    public void test(){

        reverseWords("  hello world!  ");
    }
    public String reverseWords(String s) {
        s = s.trim();
        char[] sCharArray = s.toCharArray();
        int i = sCharArray.length - 1;
        int j = sCharArray.length - 1;
        StringBuffer stringBuffer = new StringBuffer();
        while (i >= 0 && j >= 0){
            while (i >= 0 && sCharArray[i] != ' '){
                i--;
            }
            int length = i + 1;
            while (length <= j){
                stringBuffer.append(sCharArray[length]);
                length++;
            }
            stringBuffer.append(" ");
            while (i >= 0 && sCharArray[i] == ' ') i--;
            j = i;
        }
        return stringBuffer.toString().trim();
    }
}
