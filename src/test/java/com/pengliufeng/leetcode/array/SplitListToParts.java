package com.pengliufeng.leetcode.array;

/**
 * 给你一个头结点为 head 的单链表和一个整数 k ，请你设计一个算法将链表分隔为 k 个连续的部分。
 *
 * 每部分的长度应该尽可能的相等：任意两部分的长度差距不能超过 1 。这可能会导致有些部分为 null 。
 *
 * 这 k 个部分应该按照在链表中出现的顺序排列，并且排在前面的部分的长度应该大于或等于排在后面的长度。
 *
 * 返回一个由上述 k 部分组成的数组。
 *
 */
public class SplitListToParts {

    public ListNode[] splitListToParts(ListNode head, int k) {
        int length = 1 ;
        ListNode[] listNodes = new  ListNode[k];
        while (head.next != null){
            length++;
        }
        int remainder  = length%k;
        int avg = length/k;
        while (head.next != null){
            head = head.next;
        }

        for (int i = 0; i < k; i++) {

            ListNode next = head;
            ListNode param = new ListNode();
        }
        while (remainder > 0){

        }
        return listNodes;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next;
      }
  }
}
