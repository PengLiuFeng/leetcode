package com.pengliufeng.leetcode.array.listnode;
/**
 * @since 2021-12-04
 * @author mr-peng
 * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点
 */
public class GetKthFromEnd {

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode start = head;
        ListNode end = head;
        while ((k - 1) > 0){
            end = end.next;
            k--;
        }
        while (end.next != null){
            start = start.next;
            end = end.next;
        }
        return start;
    }
}
