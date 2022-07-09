package com.pengliufeng.leetcode.array;

import org.junit.Test;

public class ComplexNumberMultiply {

    @Test
    public void test(){
        complexNumberMultiply("1+-1i","1+-1i");
    }

    public String complexNumberMultiply(String num1, String num2) {
        int num1Head = -101;
        int  num1Pop= -101;
        int  num2Head= -101;
        int  num2Pop= -101;

        for (int i = 0; i < num1.length(); i++) {
            if (num1.charAt(i) == '+'){
                num1Head = Integer.valueOf(num1.substring(0,i));
                num1Pop = Integer.valueOf(num1.substring(i+1,num1.length() - 1));
                break;
            }
        }


        for (int i = 0; i < num2.length(); i++) {
            if (num2.charAt(i) == '+'){
                num2Head = Integer.valueOf(num2.substring(0,i));
                num2Pop = Integer.valueOf(num2.substring(i+1,num2.length() - 1));
                break;
            }
        }
        StringBuilder res = new StringBuilder();
        res.append(num1Head*num2Head - num1Pop*num2Pop);
        res.append("+");
        res.append(num1Head*num2Pop + num1Pop*num2Head);
        res.append("i");
        return res.toString();
    }
}
