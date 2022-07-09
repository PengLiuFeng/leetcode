package com.pengliufeng.leetcode.tree;

import java.util.*;

/**
 * @author mr-peng
 * @since
 * 给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有 从根节点到叶子节点 路径总和等于给定目标和的路径。
 *
 * 叶子节点 是指没有子节点的节点
 *
 */
public class PathSum {
    Deque<Integer> queue = new LinkedList<>();
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        dfs(root,target);
        return result;
    }
    public void dfs(TreeNode root , int target){
        if (root == null){
            return ;
        }
        queue.offerLast(root.val);
        target = target - root.val;
        if (root.right == null && root.left == null && target == 0){
            result.add(new LinkedList<>(queue));
        }
        dfs(root.left,target);
        dfs(root.right,target);
        queue.pollLast();
    }
}
