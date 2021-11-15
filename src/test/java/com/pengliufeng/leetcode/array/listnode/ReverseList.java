package com.pengliufeng.leetcode.array.listnode;

import org.junit.Test;

import java.util.Stack;

/**
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode file = head;
        if (head == null){
            return head;
        }
        Stack<Integer> value = new Stack<>();
        value.push(head.val);
        while (head.next != null){
            head = head.next;
            value.push(head.val);
        }
        ListNode result = file;
        while (file != null){
            file.val = value.pop();
            file = file.next;
        }
        return result;
    }

    @Test
    public void test(){
        ListNode listNode = new ListNode(1);
        ListNode result = listNode;
        int i = 2;
        while (i < 6){
            listNode.next = new ListNode(i);
            listNode = listNode.next;
            i++;
        }
        reverseList(result);
    }
}
