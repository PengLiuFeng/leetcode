package com.pengliufeng.leetcode.array.listnode;

/**
 * @since 2021-12-04
 * @author mr-peng
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 *
 * 返回删除后的链表的头节点
 */
public class DeleteNode {

    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val){
            return head.next;
        }
        ListNode listNode = head;
        while (head.next != null){
            if (head.next.val == val){
                head.next = head.next.next;
            }else{
                head = head.next;
            }
        }
        return listNode;

    }

    public ListNode deleteNodeTwo(ListNode head , int val){
        while(head != null && head.val == val){
            head = head.next;
        }
        if(head == null){
            return null;
        }
        ListNode treeHead = head;
        while(head.next != null){
            if(head.next.val == val){
                head.next = head.next.next;
            }else {
                head = head.next;
            }

        }
        return treeHead;
    }

}
