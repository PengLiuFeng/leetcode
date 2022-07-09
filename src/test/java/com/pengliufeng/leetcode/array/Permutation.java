package com.pengliufeng.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class Permutation {

    List<String> resultString ;
    boolean[] vis ;

    public String[] permutation(String s) {
        int length = s.length();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        resultString = new ArrayList<>();
        vis = new boolean[length];
        StringBuffer stringBuffer = new StringBuffer();
        brackMothed(arr,0 , length, stringBuffer);

        String[] res = new String[resultString.size()];
        for (int i = 0; i < resultString.size(); i++) {
            res[i] = resultString.get(i);
        }
        return res;
    }

    void brackMothed(char[] arr , int i , int j , StringBuffer prem){
        if (i == j){
            resultString.add(prem.toString());
            return;
        }

       for (int n = 0 ; n < j ; n++){
           if (vis[n] || (n > 0 && !vis[n-1] && arr[n] == arr[n-1])){
               continue;
           }
           vis[n] = true;
           prem.append(arr[n]);
           brackMothed(arr, i + 1 , j ,prem);
           prem.deleteCharAt(prem.length() - 1);
           vis[n] = false;
       }
    }
}
