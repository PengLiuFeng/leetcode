package com.pengliufeng.leetcode.array;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.yaml.snakeyaml.util.ArrayUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author mr_peng
 * @since  2021/08/09
 * <p>
 *     给你一个字符串 s ，仅反转字符串中的所有元音字母，并返回结果字符串。
 *
 * 元音字母包括 "a"、"e"、"i"、"o"、"u"，且可能以大小写两种形式出现。
 * </p>
 */

@SpringBootTest
public class ReverseVowelsTest {

    @Test
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        String templeString = "aeiouAEIOU";
        String[] temple = new String[]{"a","e","i","o","u"};
        Set<String> templeSet = new HashSet<>(Arrays.asList(temple));
        int startIndex = 0 ;
        int endIndex = chars.length - 1 ;
        while ( startIndex < endIndex ) {

            while (startIndex < endIndex && templeString.indexOf(chars[startIndex]) < 0){
                startIndex++;
            }
            while (startIndex < endIndex && templeString.indexOf(chars[endIndex]) < 0){
                endIndex--;
            }
            if (startIndex < endIndex){
                char tep = chars[startIndex];
                chars[startIndex] = chars[endIndex];
                chars[endIndex] = tep;
            }
            startIndex++;
            endIndex--;
        }

        return String.copyValueOf(chars);
    }
}
