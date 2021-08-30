package com.pengliufeng.leetcode.array;

import org.junit.Test;

/**
 * @author mr_peng
 * @since 2021/08/23
 * <p>
 *  给你一个整数 n 。按下述规则生成一个长度为 n + 1 的数组 nums ：
 *
 * nums[0] = 0
 * nums[1] = 1
 * 当 2 <= 2 * i <= n 时，nums[2 * i] = nums[i]
 * 当 2 <= 2 * i + 1 <= n 时，nums[2 * i + 1] = nums[i] + nums[i + 1]
 * 返回生成数组 nums 中的 最大 值。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/get-maximum-in-generated-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * </p>
 */
public class GetMaximumGenerated {

    @Test
    public void test(){
        System.out.println(getMaximumGenerated(2));
    }

    public int getMaximumGenerated(int n) {

        int[] result = new int[n+1];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n+1 ; i++) {
            if (i <= 1){
                result[i] = i;
            }
            if ( 2 <= 2*i && 2*i <= n){
                result[2*i] = result[i];
            }
            if (2 <= (2*i + 1) && (2*i + 1) <= n){
                result[2*i + 1] = result[i] + result[i+1];
            }
            max = Math.max(max, result[i]);
        }
        return max;
    }
}
