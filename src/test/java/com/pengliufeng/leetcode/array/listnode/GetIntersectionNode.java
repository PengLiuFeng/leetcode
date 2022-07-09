package com.pengliufeng.leetcode.array.listnode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author mr-peng
 * @since 2021-12-05
 * 输入两个链表，找出它们的第一个公共节点。
 */
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null){
            return null;
        }
        Set<ListNode> content = new HashSet<>();
        while (headA != null){
            content.add(headA);
            headA = headA.next;
        }
        while (headB != null){
            if (content.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}
