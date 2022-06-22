/**
 * OPay Inc.
 * Copyright (c) 2016-2022 All Rights Reserved.
 */
package com.pengliufeng.leetcode.offer;


import com.pengliufeng.leetcode.tree.MinDiffInBSTTest;

/**
 * @author liufeng.peng
 * @version $Id: SubChildrenTree.java, v 0.1 2022-06-13 11:10 liufeng.peng Exp $$
 */
public class SubChildrenTree {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (null == B || null == A){
            return false;
        }
        return dfs(A,B);
    }

    private boolean dfs(TreeNode a, TreeNode b) {
        if (a == null){
            return false;
        }
        return isChildren(a,b) || dfs(a.left,b) || dfs(a.right ,b);
    }

    private boolean isChildren(TreeNode a, TreeNode b) {
        if (b == null){
            return true;
        }
        if (a == null || a.val != b.val){
            return false;
        }
        return isChildren(a.right,b.right) && isChildren(a.left,b.left);
    }
}