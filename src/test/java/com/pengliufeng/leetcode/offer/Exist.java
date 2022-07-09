package com.pengliufeng.leetcode.offer;

import org.apache.logging.log4j.util.Strings;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class Exist {

    @Test
    public void test(){
        //char[][] param = new char[][]{{'A','B','C','E'}, {'S','F','C','S'},{'A','D','E','E'}};
        char[][] param = new char[][]{{'a','a'}};
        exist(param,"aaa");
    }

    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int column = board[0].length;
        boolean[][] via = new boolean[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (dfs(i,j,word,board,via)) return true;
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, String word, char[][] board,boolean[][] via) {
        if ("".equals(word)){
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || via[i][j] || board[i][j] != word.charAt(0)){
            return false;
        }
        via[i][j] = true;
        boolean result = dfs(i+1,j,word.substring(1),board,via) ||  dfs(i-1,j,word.substring(1),board,via) ||
                dfs(i,j+1,word.substring(1),board,via) ||  dfs(i,j-1,word.substring(1),board,via);
        via[i][j] = false;
        return result;
    }
}
