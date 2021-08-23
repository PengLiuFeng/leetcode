package com.pengliufeng.leetcode.array;

import org.junit.Test;

/**
 * @author mr_peng
 * @since 2021/08/20
 *给你一个字符数组 chars ，请使用下述算法压缩：
 *
 * 从一个空字符串 s 开始。对于 chars 中的每组 连续重复字符 ：
 *
 * 如果这一组长度为 1 ，则将字符追加到 s 中。
 * 否则，需要向 s 追加字符，后跟这一组的长度。
 * 压缩后得到的字符串 s 不应该直接返回 ，需要转储到字符数组 chars 中。需要注意的是，如果组长度为 10 或 10 以上，则在 chars 数组中会被拆分为多个字符。
 *
 * 请在 修改完输入数组后 ，返回该数组的新长度。
 *
 * 你必须设计并实现一个只使用常量额外空间的算法来解决此问题。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/string-compression
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Compress {

    @Test
    public void test(){
        char[] param = {'a','a','b','b','c','c','c'};
        char pa = 0;
        int pas = 0;
        System.out.println(pa);
        System.out.println(pas);
        System.out.println(compress(param));
    }

    public int compress(char[] chars) {
        if (chars.length == 1 ){
            return 1;
        }
        int left = 0 ; 
        int right = 1 ;
        for (int i = 0; i < chars.length; i++) {

        }
        return 0;
    }
}
