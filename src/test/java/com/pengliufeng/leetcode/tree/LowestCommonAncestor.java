package com.pengliufeng.leetcode.tree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author mr-peng
 * @since 2021-12-21
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 */
public class LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if ((root.val > p.val && root.val > q.val)){
            return lowestCommonAncestor(root.left,p,q);
        }else if ((root.val < p.val && root.val < q.val)){
            return lowestCommonAncestor(root.right,p,q);
        }else {
            return root;
        }
    }

    TreeNode head ;
    public TreeNode lowestCommonAncestors(TreeNode root, TreeNode p, TreeNode q) {
        boolean dfs = dfs(root, p, q);
        if (dfs){
            return head;
        }else {
            return null;
        }

    }

    public boolean dfs(TreeNode root , TreeNode p ,TreeNode q){
        if (root == null){
            return false;
        }
        boolean left = dfs(root.left, p ,q );
        boolean right = dfs( root.right , p , q );
        if ((left && right) || (root == p || root == q) && (left || right)) {
            head = root;
        }
        return left || right || root == p || root == q;
    }



}
