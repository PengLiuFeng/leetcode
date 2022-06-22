/**
 * OPay Inc.
 * Copyright (c) 2016-2022 All Rights Reserved.
 */
package com.pengliufeng.leetcode.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liufeng.peng
 * @version $Id: CopyRandomList.java, v 0.1 2022-06-14 11:01 liufeng.peng Exp $$
 */
public class CopyRandomList {

    public Node copyRandomList(Node head) {
        if (null == head){
            return null;
        }
        Node resultNode = new Node(head.val);
        Node resultHead = resultNode;
        Map<Node , Node> map = new HashMap<>();
        map.put(head,resultNode);
        while ( head != null){
            Node next = head.next;
            Node random = head.random;
            if (map.containsKey(next) || next == null){
                resultNode.next = map.get(next);
            }else {
                resultNode.next = new Node(next.val);
                map.put(next,resultNode.next);
            }
            if (map.containsKey(random) || random == null){
                resultNode.random = map.get(random);
            }else {
                resultNode.random = new Node(random.val);
                map.put(random,resultNode.random);
            }
            resultNode = resultNode.next;
            head = head.next;
        }
        return resultHead;
    }
}