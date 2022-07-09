package com.pengliufeng.leetcode.array.listnode;

import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @since 2021-12-04
 * @author mr-peng
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的
 */
public class MergeTwoList {

    @Test
    public void test(){
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        mergeTwoLists(l1,l2);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode images = result;
        ListNode l1Head = l1;
        ListNode l2Head = l2;
        while (l1Head != null && l2Head != null){
            if (l1Head.val > l2Head.val){
                result.next = l2Head;
                l2Head = l2Head.next;
            }else {
                result.next = l1Head;
                l1Head = l1Head.next;

            }
            result = result.next;
        }
        result.next = l1Head == null ? l2Head:l1Head;
        return images.next;
    }
}
