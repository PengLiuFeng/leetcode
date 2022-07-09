package com.pengliufeng.leetcode.offer;

import java.util.Arrays;

public class MovingCount {

    public int movingCount(int m, int n, int k) {
        if (k < 1){
            return k;
        }
        boolean[][] dept = new boolean[m][n];
        dept[0][0] = true;
        int sum = 1;
        for (int i = 1 ; i < m && i <= k ; i++ ){
            dept[i][0] = true;
            sum++;
        }
        for (int i = 1 ; i < n && i <= k ; i++ ){
            dept[0][i] = true;
            sum++;
        }
        for (int i = 1 ; i < m ; i++){
            for(int j = 1 ; j < n && !judge(i,j,k) ; j++){
                if ( i == m - 1 && j == n -1 ){
                    dept[i][j] =  dept[i-1][j] || dept[i][j-1];
                }else if ( j == n - 1){
                    dept[i][j] = dept[i+1][j] || dept[i-1][j] || dept[i][j-1];
                }else if ( i == m - 1){
                    dept[i][j] =  dept[i][j+1] || dept[i-1][j] || dept[i][j-1];
                }else {
                    dept[i][j] = dept[i+1][j] || dept[i][j+1] || dept[i-1][j] || dept[i][j-1];
                }
                if(dept[i][j] == true){
                    sum++;
                }
            }
        }
        return sum;
    }

    private boolean judge(int i, int j,int k) {
        int iSum = 0;
        int jSum = 0;
        while (i > 0 || j > 0){
            iSum += i%10;
            jSum += j%10;
        }
        return jSum + iSum < k;
    }
}
