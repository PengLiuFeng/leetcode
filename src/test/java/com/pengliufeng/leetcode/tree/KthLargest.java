package com.pengliufeng.leetcode.tree;

/**
 * @author mr-peng
 * @since 2021-12-08
 * 给定一棵二叉搜索树，请找出其中第 k 大的节点的值。
 */
public class KthLargest {
    int k ,res ;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;

    }

    public void  dfs(TreeNode root){
        if (root == null){
            return;
        }
        dfs(root.right);
        if (k == 0) return;
        if (--k == 0) this.res = root.val;
        dfs(root.left);
    }
}
