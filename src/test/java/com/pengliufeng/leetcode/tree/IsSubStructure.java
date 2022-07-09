package com.pengliufeng.leetcode.tree;

import apple.laf.JRSUIUtils;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author mr-peng
 * @since 2021-11-30
 * 判断二叉树B是否是A的子树，空树不算任何树的子树
 */
public class IsSubStructure {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
       if (A == null || B == null) return false;
       return reserve(A,B) || isSubStructure(A.left,B) || isSubStructure(A.right,B);
    }

    private boolean reserve(TreeNode A , TreeNode B){
        if (B == null) return true;
        if (A == null || A.val != B.val ) return false;
        return reserve(A.left,B.left) && reserve(A.right,B.right);
    }

    @Test
    public void test(){
        TreeNode A = new TreeNode(1);
        A.left = new TreeNode(2);
        A.right = new TreeNode(3);
        A.left.left = new TreeNode(4);

        TreeNode B = new TreeNode(3);
        isSubStructure(A,B);
    }
}
