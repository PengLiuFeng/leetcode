package com.pengliufeng.leetcode.tree;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 给你一个二叉搜索树的根节点 root ，返回 树中任意两不同节点值之间的最小差值 。
 *
 * @author mr_peng
 * @since 2021/04/13
 * https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes/
 */

@SpringBootTest
public class MinDiffInBSTTest {

    @Test
    public int minDiffInBST(TreeNode root) {
        return 1;
    }

    private int etMinDiffinBST(int value1, int value2, int maxValue, TreeNode root) {
        if (root.left == null) {
            return maxValue;
        } else {
            maxValue = etMinDiffinBST(root.val, root.left.val, Math.min(maxValue, Math.abs(root.val - root.left.val)), root.left);
        }

        if (root.right == null) {
            return maxValue;
        } else {
            maxValue = etMinDiffinBST(root.val, root.right.val, Math.min(maxValue, Math.abs(root.val - root.right.val)), root.right);
        }
        return maxValue;
    }


    public class TreeNode {
        int val;
        private TreeNode left;
        private TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
