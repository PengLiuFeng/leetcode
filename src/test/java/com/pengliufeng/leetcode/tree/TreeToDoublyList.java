package com.pengliufeng.leetcode.tree;

/**
 * @author mr-peng
 * @since 2021-12-08
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的循环双向链表。要求不能创建任何新的节点，只能调整树中节点指针的指向
 */
public class TreeToDoublyList {
    Node head , pre;
    public Node treeToDoublyList(Node root) {
        if (null == root){
            return null;
        }
            dfs(root);
            head.left = pre;
            pre.right = head;
            return head;
    }

    /**
     * 搜索二叉树使用中序遍历就是一个有序数组
     * @param
     * @return
     */
    public void dfs(Node cur){
        if (cur == null){
            return;
        }
        dfs(cur.left);
        if (pre == null){
            head = cur;
            pre = cur;
        }else {
            pre.right = cur;
            cur.left = pre;
            pre = cur;
        }
        dfs(cur.right);
    }
}
