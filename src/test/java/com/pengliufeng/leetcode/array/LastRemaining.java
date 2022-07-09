package com.pengliufeng.leetcode.array;

import org.junit.Test;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LastRemaining {

    public int lastRemaining(int n, int m) {
        int f = 0 ;
        for (int i = 2; i != n + 1; ++i) {
            f = (m + f) % i;

        }
        return f;

    }

    @Test
    public void test(){
        int[][] param = {{1,2,3},{4,5,6},{7,8,9}};
        spiralOrder(param);
    }

    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return new int[0];
        }
        int row = matrix.length , column = matrix[0].length;
        int left = 0 , right = column - 1 ,top = 0 , bottom = row - 1;
        int index = 0 ;
        int[] res = new int[row * column];
        while (left <= right && top <= bottom){
            for( int columnIndex = left ; columnIndex <= right; columnIndex++ ){
                res[index++] = matrix[top][columnIndex];
            }
            for (int rowIndex = top + 1 ; rowIndex <= bottom ; rowIndex++ ){
                res[index++] = matrix[rowIndex][right];
            }
            if (left < right && top < bottom){
                for (int columnIndex = right - 1 ; columnIndex >= left ; columnIndex--){
                    res[index++] = matrix[bottom][columnIndex];
                }
                for (int rowIndex = bottom - 1  ; rowIndex > top ; rowIndex-- ){
                    res[index++] = matrix[rowIndex][left];
                }
            }
            left++;
            top++;
            bottom--;
            right--;
        }
        return res;


    }

}
