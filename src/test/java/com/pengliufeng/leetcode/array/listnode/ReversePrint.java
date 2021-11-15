package com.pengliufeng.leetcode.array.listnode;

public class ReversePrint {

    public int[] reversePrint(ListNode head) {
        if (head == null){
            return new int[0];
        }
        int lenght = 1 ;
        ListNode start = head;
        while (head.next != null){
            lenght ++;
            head = head.next;
        }
        int[] result = new int[lenght];
        while (lenght > 0){
            result[lenght-1] = start.val;
            lenght --;
            start = start.next;
        }
        return result;
    }
}
