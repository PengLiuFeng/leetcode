package com.pengliufeng.leetcode.array;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author mr_peng
 * @since 2021/08/20
 *给你一个大小为 m * n 的矩阵 mat，矩阵由若干军人和平民组成，分别用 1 和 0 表示。
 *
 * 请你返回矩阵中战斗力最弱的 k 行的索引，按从最弱到最强排序。
 *
 * 如果第 i 行的军人数量少于第 j 行，或者两行军人数量相同但 i 小于 j，那么我们认为第 i 行的战斗力比第 j 行弱。
 *
 * 军人 总是 排在一行中的靠前位置，也就是说 1 总是出现在 0 之前。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/the-k-weakest-rows-in-a-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class kWeakestRows {
    
    @Test
    public void  test(){
        int[][] param = {{1,1,0,0,0}, {1,1,1,1,0}, {1,0,0,0,0}, {1,1,0,0,0}, {1,1,1,1,1}};
        System.out.println(kWeakestRows(param, 3));
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] array = new int[k][2];
        for (int i = 0; i < mat.length; i++) {
            int[] clu = mat[i];
            int sum = 0 ;
            for (int i1 = 0; i1 < clu.length; i1++) {
                sum += clu[i1];
            }
            recove(array , i , sum + 1);
        }
        int[] result = new int[k];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i][1];
        }
        return result;

    }

    private void recove(int[][] result, int i, int sum){
        for (int j = 0; j < result.length ; j++) {
            if (sum < result[j][0]){
                for (int k = (result.length - 1 ) ; k > j ; k--) {
                   result[k][0] = result[k-1][0] ;
                   result[k][1] = result[k-1][1] ;
                }
                result[j][0] = sum ;
                result[j][1] = i ;
                break;
            }else if (sum == result[j][1] && result[j][0] > i){
                result[j][0] = i ;
                break;
            }else if (result[j][0] == 0){
                result[j][0] = sum ;
                result[j][1] = i ;
                break;
            }

        }
    }
}
