/**
 * OPay Inc.
 * Copyright (c) 2016-2022 All Rights Reserved.
 */
package com.pengliufeng.leetcode.offer;

import org.junit.Test;

import java.util.*;

/**
 * @author liufeng.peng
 * @version $Id: LevelOrder.java, v 0.1 2022-06-20 10:10 liufeng.peng Exp $$
 */
public class LevelOrder {

    @Test
    public void test(){
        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode1 = new TreeNode(15);
        TreeNode treeNode2 = new TreeNode(7);
        TreeNode treeNode3 = new TreeNode(20);
        treeNode3.left = treeNode1;
        treeNode3.right = treeNode2;
        TreeNode treeNode4 = new TreeNode(9);
        treeNode.left = treeNode4;
        treeNode.right = treeNode3;
        levelOrder(treeNode);

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null){
            return Collections.emptyList();
        }
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int left = 1;
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode poll =  queue.poll();
                list.add(poll.val);
                if (poll.left != null){
                    queue.offer(poll.left);
                }
                if (poll.right != null){
                    queue.offer(poll.right);
                }
            }
            if (left % 2 == 0 ) Collections.reverse(list);
            left++;

            result.add(list);
        }
        return result;
    }
}