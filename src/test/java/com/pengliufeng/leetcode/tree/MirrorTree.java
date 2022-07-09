package com.pengliufeng.leetcode.tree;

/**
 * @author mr-peng
 * @since 2021-11-30
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像
 */
public class MirrorTree {
    public TreeNode mirrorTree(TreeNode root) {
        exchangeTree(root);
        return root;
    }

    public void exchangeTree(TreeNode treeNode) {
        if (treeNode == null){
            return;
        }
        TreeNode temp = treeNode.left;
        treeNode.left = treeNode.right;
        treeNode.right = temp;
        exchangeTree(treeNode.left);
        exchangeTree(treeNode.right);
    }


    public boolean test(TreeNode leftNode , TreeNode rightNode){
        if (leftNode == null && rightNode == null) return true;
        if (leftNode == null || rightNode == null || leftNode.val != rightNode.val) return false;
        return test(leftNode.left,rightNode.right) && test(leftNode.right,rightNode.left);
    }
}
