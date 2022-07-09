package com.pengliufeng.leetcode.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbers {

    @Test
    public void test(){
        int[][] param = new int[][]{{3,7,8},{9,11,13},{15,16,17}};
        luckyNumbers(param);
    }


    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int row = matrix.length;
        int column = matrix[0].length;
        int[] min = new int[row];
        int[] max = new int[column];
        for(int i = 0 ; i < row; i++){
            int[] rowArray = matrix[i];
            min[i] = getMin(rowArray);
        }

        for(int i = 0 ; i < column ; i++){
            for(int j = 0 ; j < row ; j++){
                max[i] = Math.max(max[i] , matrix[j][i]);
            }
        }

        for(int i = 0 ; i < row ; i++){
            for(int j = 0; j < column ; j++){
                if(max[j] == min[i]){
                    res.add(max[j]);

                }
            }
        }
        return res;
    }

    public int getMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < array.length ; i++){
            min = Math.min(array[i] , min);
        }
        return min;
    }
}
