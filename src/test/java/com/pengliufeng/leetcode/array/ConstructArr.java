package com.pengliufeng.leetcode.array;

/**
 * @author mr-peng
 * @since 2021-12-23
 * <p>
 *     给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，其中 B[i] 的值是数组 A 中除了下标 i 以外的元素的积, 即 B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
 *
 *
 * </p>
 */
public class ConstructArr {

    public int[] constructArr(int[] a) {
        int length = a.length;
        int[] b = new int[length];
        if (length == 0) return b;
        b[0] = 1;
        for (int i = 1; i < a.length; i++) {
            b[i] = b[i-1] * a[i-1];
        }
        int temp = 1;
        for (int i = length - 2 ; i >= 0; i--) {
            temp *=  a[i+1] ;
            b[i] *= temp;
        }
        return b;
    }
}
