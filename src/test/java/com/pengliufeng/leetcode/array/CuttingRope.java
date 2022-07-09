package com.pengliufeng.leetcode.array;

/**
 * @author mr-peng
 * @since 2021-12-23
 * <p>
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m-1] 。请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 *
 * </p>
 */
public class CuttingRope {

    /**
     * 通过数学推导，绳子等分得到的成绩最大， 等分为三分的到的成绩最大
     * @param n
     * @return
     */
    public int cuttingRope(int n) {
        if (n <= 3 ){
            return n - 1;
        }
        int a = n / 3 , b = n % 3;
        if (b == 0) return  Double.valueOf(Math.pow(3 , a)).intValue();
        else if (b == 1) return  Double.valueOf(Math.pow(3 , a-1)*4).intValue();
        else  return  Double.valueOf(Math.pow(3, a ) * 2).intValue() ;
    }

    public int cuttingRopes(int n) {
        if (n <= 3){
            return n-1;
        }
        int p = n % 3 , temple = 1000000007;
        long res = 1 , x = 3;
        for ( int i = (n / 3 -1) ; i > 0 ; i/=2){
            if (i%2 == 1) res = (res*x) % temple;
            x = (x * x) % temple;
        }
        if (p == 0) return (int) (res * 3 % temple);
        if (p == 1) return (int)(( res * 4) % temple);
        else return (int) ((res * 6) % temple);
    }
}
