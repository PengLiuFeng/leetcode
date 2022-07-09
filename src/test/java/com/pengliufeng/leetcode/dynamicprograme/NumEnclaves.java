package com.pengliufeng.leetcode.dynamicprograme;

import org.junit.Test;

public class NumEnclaves {

    @Test
    public void test(){
        int[][] param = new int[][]{{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}};
        numEnclaves(param);
    }
    boolean[][] isEclaces ;
    int row ;
    int column ;
    public int numEnclaves(int[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0){
            return 0;
        }
        int sum = 0 ;
         row = grid.length;
         column = grid[0].length;
        isEclaces = new boolean[row][column];
        for (int i = 0; i < row; i++) {
            jungle(i,0,grid);
            jungle(i,column - 1, grid);
        }
        for (int i = 0; i < column; i++) {
            jungle(0,i ,grid);
            jungle(row - 1 , i , grid);
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (!isEclaces[i][j] && grid[i][j] == 1){
                    sum++;
                }

            }

        }
        return sum;

    }

    void  jungle(int i , int j , int[][] grid){
       if (i < 0 || i >= row || j < 0 || j >= column || grid[i][j] == 0 || isEclaces[i][j]){
           return;
       }
       isEclaces[i][j] = true;
       jungle(i+1 , j ,grid);
       jungle(i-1,j ,grid);
       jungle(i ,j+1 ,grid);
       jungle(i,j-1,grid);
    }
}
