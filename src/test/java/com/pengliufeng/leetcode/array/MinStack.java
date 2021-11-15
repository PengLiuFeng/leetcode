package com.pengliufeng.leetcode.array;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Stack;

public class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    public MinStack() {

    }

    public void push(int x) {
        mainStack.push(x);
        if (minStack.isEmpty()){
            minStack.push(x);
        }
        if (!minStack.isEmpty() && x <= minStack.peek()){
            minStack.push(x);
        }
    }

    public void pop() {
        int pop = mainStack.pop();
        if (mainStack.isEmpty()){
            minStack.clear();
            return;
        }
        if (!minStack.isEmpty() && pop <= minStack.peek()){
            minStack.pop();
        }
    }

    public int top() {
        return mainStack.peek();
    }

    public int min() {
        return minStack.peek();
    }

    static class TestMin {
        @Test
        public void minTest() {
            MinStack minStack = new MinStack();
            minStack.push(-2);
            minStack.push(0);
            minStack.push(-1);
//            minStack.top();
//            minStack.pop();
            minStack.min();
//            minStack.pop();
//            minStack.min();
//            minStack.pop();
//            minStack.push(2147483647);
            minStack.top();
//            minStack.min();
//            minStack.push(-2147483648);
//            minStack.top();
//            minStack.min();
            minStack.pop();
            minStack.min();
        }

    }
}
