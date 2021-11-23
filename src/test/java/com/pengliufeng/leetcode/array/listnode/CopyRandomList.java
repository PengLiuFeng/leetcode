package com.pengliufeng.leetcode.array.listnode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mr-peng
 *
 * 请实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。
 *
 */
public class CopyRandomList {
    Map<Node,Node> cacheNode = new HashMap<>();
    public Node copyRandomList(Node head) {
        if (head == null){
            return null;
        }
        if(!cacheNode.containsKey(head)){
            Node newNode = new Node(head.val);
            cacheNode.put(head,newNode);
            newNode.next = copyRandomList(head.next);
            newNode.random = copyRandomList(head.random);
        }
        return cacheNode.get(head);
    }
}
