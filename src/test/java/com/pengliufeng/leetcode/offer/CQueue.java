/**
 * OPay Inc.
 * Copyright (c) 2016-2022 All Rights Reserved.
 */
package com.pengliufeng.leetcode.offer;

import java.util.Stack;

/**
 * @author liufeng.peng
 * @version $Id: CQueue.java, v 0.1 2022-06-13 10:09 liufeng.peng Exp $$
 */
public class CQueue {

    private static Stack<Integer> headStack = new Stack<>();
    private static Stack<Integer> endStack = new Stack<>();

    public CQueue() {

    }

    public void appendTail(int value) {
        headStack.push(value);
    }

    public int deleteHead() {
        if (endStack.isEmpty()){
            moveValue(headStack,endStack);
        }
        return endStack.isEmpty() ? -1 : endStack.pop();
    }

    private void moveValue(Stack<Integer> headStack, Stack<Integer> endStack){
        while(!headStack.isEmpty()){
            endStack.push(headStack.pop());
        }
    }
}