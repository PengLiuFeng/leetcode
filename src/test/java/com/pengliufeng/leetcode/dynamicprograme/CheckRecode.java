package com.pengliufeng.leetcode.dynamicprograme;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author mr_peng
 * @since 2021/08/19
 * <p>
 * 可以用字符串表示一个学生的出勤记录，其中的每个字符用来标记当天的出勤情况（缺勤、迟到、到场）。记录中只含下面三种字符：
 * 'A'：Absent，缺勤
 * 'L'：Late，迟到
 * 'P'：Present，到场
 * 如果学生能够 同时 满足下面两个条件，则可以获得出勤奖励：
 *
 * 按 总出勤 计，学生缺勤（'A'）严格 少于两天。
 * 学生 不会 存在 连续 3 天或 连续 3 天以上的迟到（'L'）记录。
 * 给你一个整数 n ，表示出勤记录的长度（次数）。请你返回记录长度为 n 时，可能获得出勤奖励的记录情况 数量 。答案可能很大，所以返回对 109 + 7 取余 的结果。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/student-attendance-record-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * </p>
 */
@SpringBootTest
public class CheckRecode {

    @Test
    public void test(){
        System.out.println(this.checkRecord(10101));
    }

    public int checkRecord(int n) {
        //取膜，其实也可以不用，但是为了不溢出，还是取膜
        final int mod = 1000000007;
        int[][] dp = new int[2][3];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            int[][] dm = new int[2][3];
            //假设第i天开始有多少种匹配方式
            //第i天是P

            for (int j = 0 ; j <= 1 ; j++){
                for (int k = 0 ; k <= 2 ; k++){
                    dm[j][0] = (dp[j][k] + dm[j][0]) % mod ;
                }
            }

            //第i天是A
                for (int k = 0 ; k <= 2 ; k++){
                    dm[1][0] = (dm[1][0] + dp[0][k]) % mod ;
                }
            //第i天是L
            for (int j = 0 ; j <= 1 ; j++){
                for (int k = 1 ; k <= 2 ; k++){
                    dm[j][k] = (dm[j][k] + dp[j][k-1]) % mod ;
                }

            }
            dp = dm;
        }
        int sum = 0 ;
        for (int j = 0 ; j <= 1 ; j++){
            for (int k = 0 ; k <= 2 ; k++){
                sum = (sum + dp[j][k]) % mod;
            }
        }
            return  sum;
    }
}
