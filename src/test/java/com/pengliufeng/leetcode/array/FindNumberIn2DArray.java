package com.pengliufeng.leetcode.array;

import org.junit.Test;

/**
 * @author mr-peng
 * @since 2021-11-27
 */
public class FindNumberIn2DArray {

    @Test
    public void test(){
        int[][] array = {{1,4,7,11,15},
                         {2,5,8,12,19},
                         {3,6,9,16,22},
                         {10,13,14,17,24},
                         {18,21,23,26,30}};
        int[][] array2 = {{3,3,8,13,13,18},
                {4,5,11,13,18,20},
                {9,9,14,15,23,23},
                {13,18,22,22,25,27},
                {18,22,23,28,30,33},
                {21,25,28,30,35,35},
                {24,25,33,36,37,40}};
        findNumberIn2DArray(array2,21);

    }
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int rows = matrix.length - 1;
        int columns = matrix[0].length - 1;
        int row = 0;
        int column = columns;
        while (row <= rows &&  column >= 0){
            if (matrix[row][column] == target){
                return true;
            }else if (matrix[row][column] > target){
                column--;
            }else {
                row++;
            }
        }
        return false;
    }
}
