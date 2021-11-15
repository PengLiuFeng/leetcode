package com.pengliufeng.leetcode.array;

import org.junit.Test;

public class CompareVersion {

    @Test
    public void test(){
        String version1 = "1.0.0.0.0.0", version2 = "1.0.0.0";
        System.out.println(compareVersion(version1,version2));
    }

    public int compareVersion(String version1, String version2) {
        String[] version1Array = version1.split("\\.");
        String[] version2Array = version2.split("\\.");

        for (int i = 0; i < Math.max(version1Array.length,version2Array.length) ; i++) {
             int v1 = 0;
             int v2 = 0;
             if (i < version1Array.length){
                v1 = Integer.parseInt(version1Array[i]);
             }
            if (i < version2Array.length){
                v2 = Integer.parseInt(version2Array[i]);
            }

            if (i == (Math.max(version1Array.length,version2Array.length) -1 ) && v1 == v2){
                return 0;
            }
            if (v1 > v2){
                return 1;
            }
            if (v1 < v2){
                return -1;
            }
        }
        return -1;

    }
}
