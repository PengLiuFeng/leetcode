package com.pengliufeng.leetcode.array;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数。
 * <p>
 * 注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。
 *
 * @author mr_peng
 * @since 2021/04/12
 */
@SpringBootTest
public class LargestNumber {

    @Test
    public void largestNumber() {
        int[] param = {10, 22, 18, 270, 27, 9, 5};
        System.out.println(largestNumber(param));
    }

    public String largestNumber(int[] nums) {
        String[] newNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i] + "";
        }
        Arrays.sort(newNums, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.contains(o2) || o2.contains(o1)) {
                    int o1Int = Integer.parseInt(o1);
                    int o2Int = Integer.parseInt(o2);
                    if (o1Int % o2Int == 0) {
                        return 1;
                    }
                }
                return o2.compareTo(o1);
            }
        });

        return String.join("", newNums);
    }
}
