package com.pengliufeng.leetcode.tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author mr-peng
 * @since 2021-12-27
 * <p>
 *     请实现两个函数，分别用来序列化和反序列化二叉树。
 *
 * 你需要设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构
 *
 * </p>
 */
public class Serialize {
    private final String SPILT = ",";
    private final String NONE = "None";
    // Encodes a tree to a single string.

    @Test
    public void test(){
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.right.left = new TreeNode(4);
        treeNode.right.right = new TreeNode(5);

        String serialize = serialize(treeNode);
        TreeNode treeNode1 = deserialize(serialize);

    }

    public String serialize(TreeNode root) {
        List<String> res = new ArrayList<>();
        dfs(root, res);
        return String.join(SPILT,res);
    }

    private void dfs(TreeNode root, List<String> res) {
        if (root == null){
            res.add(NONE);
            return;
        }
        res.add(root.val+"");
        dfs(root.left,res);
        dfs(root.right,res);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] strings = data.split(SPILT);
        if (strings.length == 0){
            return null;
        }
        List<String> list = new LinkedList<>(Arrays.asList(strings));
        return dfs(list);
    }
    private TreeNode dfs(List<String> list){
        if (list.isEmpty() || list.get(0) == null || list.get(0).equals(NONE)){
            if (!list.isEmpty()) list.remove(0);
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(list.get(0)));
        list.remove(0);
        root.left = dfs(list);
        root.right = dfs(list);
        return root;
    }
}
