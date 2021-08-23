package com.pengliufeng.leetcode.array;

import org.assertj.core.util.Strings;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author mr_peng
 * @since 2021/08/20
 *
 *给定一个字符串 s 和一个整数 k，从字符串开头算起，每 2k 个字符反转前 k 个字符。
 *
 * 如果剩余字符少于 k 个，则将剩余字符全部反转。
 * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-string-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

@SpringBootTest
public class ReverseString {

    @Test
    public void test(){
        System.out.println(reverseStr("abcdefg",2));

    }

    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i += 2*k) {
            if ((chars.length - i) < k) {
                for (int j = 0 ; j < (chars.length - i )/2 ; j++){
                    reverse(chars, i+j , chars.length - j - 1 );
                }
                continue;
            }
            for (int j = 0 ; j < k/2 ; j++){
                    reverse(chars,i+j,i - 1 + k - j);
            }

        }
        return String.valueOf(chars);
    }

    private void reverse(char[] chars , int i , int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
