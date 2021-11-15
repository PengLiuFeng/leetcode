package com.pengliufeng.leetcode.array;

import java.util.Stack;

public class CQueue {

    private Stack<Integer> appendQuery = new Stack();

    private Stack<Integer> deleteQuery = new Stack();

    public CQueue() {

    }

    public void appendTail(int value) {
        appendQuery.push(value);
    }

    public int deleteHead() {
        if (deleteQuery.isEmpty()){
            exchangeQuery(appendQuery,deleteQuery);
        }
        return deleteQuery.isEmpty() ? -1 : deleteQuery.pop();
    }

    public void exchangeQuery (Stack<Integer> originQuery , Stack<Integer> targetQuery){
        targetQuery.empty();
        while ( !originQuery.isEmpty() && originQuery.peek() != null ){
            targetQuery.push(originQuery.pop());
        }
    }

}
