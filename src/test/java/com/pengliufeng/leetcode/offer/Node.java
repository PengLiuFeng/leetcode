/**
 * OPay Inc.
 * Copyright (c) 2016-2022 All Rights Reserved.
 */
package com.pengliufeng.leetcode.offer;

/**
 * @author liufeng.peng
 * @version $Id: Node.java, v 0.1 2022-06-14 11:02 liufeng.peng Exp $$
 */
public class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}