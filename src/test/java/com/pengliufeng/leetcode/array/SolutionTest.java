package com.pengliufeng.leetcode.array;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
 * https://leetcode-cn.com/problems/rotate-list/
 */
@SpringBootTest
public class SolutionTest {

    @Test
    public ListNode buildParam() {
        int[] paramInt = {1, 2, 3, 4, 5, 6};
        ListNode param = new ListNode();
        for (int i : paramInt) {
            injectValue(param, i);
        }
        return rotateRight(param.next, 2);
    }

    private ListNode injectValue(ListNode param, int i) {
        if (param.next == null) {
            param.next = new ListNode(i);
        }
        return injectValue(param.next, i);
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int length = deptParam(head);
        int i = k % length;
        if (i == 0) {
            return head;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (i-- > 0) {
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        fast.next = head;
        ListNode result = slow.next;
        slow.next = null;

        return result;
    }

    int deptParam(ListNode listNode) {
      /*  if (listNode.next == null){
            return 1;
        }
        return deptParam(listNode.next)+1;*/
        if (listNode == null) {
            return 0;
        }
        int sum = 1;
        while (listNode.next != null) {
            sum++;
            listNode = listNode.next;
        }
        return sum;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
