package com.pengliufeng.leetcode.array;

import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.apache.commons.httpclient.HttpClient;


import java.io.IOException;
import java.util.*;

/**
 * 通常，正整数 n 的阶乘是所有小于或等于 n 的正整数的乘积。例如，factorial(10) = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1。
 * <p>
 * 相反，我们设计了一个笨阶乘 clumsy：在整数的递减序列中，我们以一个固定顺序的操作符序列来依次替换原有的乘法操作符：乘法(*)，除法(/)，加法(+)和减法(-)。
 * <p>
 * 例如，clumsy(10) = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1。然而，这些运算仍然使用通常的算术运算顺序：我们在任何加、减步骤之前执行所有的乘法和除法步骤，并且按从左到右处理乘法和除法步骤。
 * <p>
 * 另外，我们使用的除法是地板除法（floor division），所以 10 * 9 / 8 等于 11。这保证结果是一个整数。
 * <p>
 * 实现上面定义的笨函数：给定一个整数 N，它返回 N 的笨阶乘。
 * https://leetcode-cn.com/problems/clumsy-factorial/
 */
@SpringBootTest
public class ClumsyTest {

    @Test
    public void test() throws IOException {
        HttpClient httpClient = new HttpClient();
        HttpMethod httpMethod = new GetMethod();
        httpMethod.setPath("www.baidu.com");
        httpMethod.addRequestHeader("Content-Type","application/json");
        httpClient.executeMethod(httpMethod);
        String result = httpMethod.getResponseBodyAsString();
        System.out.println(result);
    }

    @Test
    public void clumsyTest() {

        Map<Object, Object> map = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            map.put(i + "A", 50);
        }
        map.get(10);
        System.out.println(clumsy(5));
    }

    public int clumsy(int N) {
        if (N <= 1) {
            return N;
        }
        int sum = 0;
        int s = N / 4;
        N += 1;

        for (int i = 1; i <= s; i++) {
            sum += N - 4 * i;
        }
        Boolean fast = true;
        while (N-- > 1) {
            if (N >= 2 && fast) {
                sum += threeSum(N);
                N -= 3;
                fast = false;
            } else {
                sum -= threeSum(N);
                N -= 3;
            }
        }


        return sum;
    }

    int threeSum(int n) {
        if (n <= 2) {
            return n;
        }
        return n * (n - 1) / (n - 2);
    }
}
