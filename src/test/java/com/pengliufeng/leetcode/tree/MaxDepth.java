package com.pengliufeng.leetcode.tree;

/**
 * @author mr-peng
 * @since
 *输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。
 */
public class MaxDepth {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        return dfs(root);
    }

    public int  dfs(TreeNode root){
        if (root == null){
            return 0;
        }
        int liftDepth = dfs(root.left);
        int rightDepth = dfs(root.right);
        return Integer.max(liftDepth,rightDepth) + 1;
    }
}
