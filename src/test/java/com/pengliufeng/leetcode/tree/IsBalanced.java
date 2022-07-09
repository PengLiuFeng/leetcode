package com.pengliufeng.leetcode.tree;

/**
 * @author mr-peng
 * @since 2021-12-21
 * 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
 */
public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        return height(root) >= 0;
    }
    public int height(TreeNode root){
        if (root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1 ){
            return -1;
        }else {
            return Math.max(leftHeight,rightHeight);
        }
    }
}
