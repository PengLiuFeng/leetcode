/**
 * OPay Inc.
 * Copyright (c) 2016-2022 All Rights Reserved.
 */
package com.pengliufeng.leetcode.offer;

import java.util.Stack;

/**
 * @author liufeng.peng
 * @version $Id: MinStack.java, v 0.1 2022-06-13 10:21 liufeng.peng Exp $$
 */
public class MinStack {
    private  Stack<Integer> mainStack = new Stack<>();
    private  Stack<Integer> minStack = new Stack<>();
    private Integer minValue = Integer.MAX_VALUE;
    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        minValue = Math.min(minValue,x);
        mainStack.push(x);
        minStack.push(minValue);
    }

    public void pop() {
        if (mainStack.isEmpty()){
            minValue = Integer.MAX_VALUE;
            return;
        }

        mainStack.pop();
        minValue = minStack.pop();
        minValue = minStack.isEmpty() ?  Integer.MAX_VALUE : minStack.peek();
    }

    public int top() {
        return mainStack.isEmpty() ? -1 : mainStack.peek();
    }

    public int min() {
        return minStack.isEmpty() ? -1 : minStack.peek();
    }
}