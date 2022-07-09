package com.pengliufeng.leetcode.tree;

import javax.management.Query;
import java.util.*;

/**
 * @author mr-peng
 * @since 2021-11-28
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。levelOrder
 *
 *
 * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
 *
 */
public class LevelOrder {

    public int[] levelOrderOne(TreeNode root) {
        if (root == null){
            return new int[0];
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode treeNode = queue.poll();
            result.add(treeNode.val);
            if (treeNode.left != null){
                queue.add(treeNode.left);
            }
            if (treeNode.right != null){
                queue.add(treeNode.right);
            }
        }
        int[] ints = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ints[i] = result.get(i);
        }
        return ints;

    }

    public List<List<Integer>> levelOrderTwo(TreeNode root) {
        if (root == null){
            return Collections.emptyList();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>>  result = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> cache = new ArrayList<>();
            int size = queue.size();
            while (size > 0){
                TreeNode treeNode = queue.poll();
                cache.add(treeNode.val);
                if (treeNode.left != null){
                    queue.add(treeNode.left);
                }
                if (treeNode.right != null){
                    queue.add(treeNode.right);
                }
                size--;
            }
            result.add(cache);
        }

        return result;

    }

    public List<List<Integer>> levelOrderThree(TreeNode root) {
        if (root == null){
            return Collections.emptyList();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>>  result = new ArrayList<>();
        queue.add(root);
        //当前层级的下一级正序还是倒序
        while (!queue.isEmpty()){
            List<Integer> cache = new ArrayList<>();
            int size = queue.size();
            while (size > 0){
                TreeNode treeNode = queue.poll();
                cache.add(treeNode.val);
                if (treeNode.left != null){
                    queue.add(treeNode.left);
                }
                if (treeNode.right != null){
                    queue.add(treeNode.right);
                }
                size--;
            }
            if (result.size() % 2 == 1) {
                Collections.reverse(cache);
            }
            result.add(cache);
        }

        return result;

    }
}
