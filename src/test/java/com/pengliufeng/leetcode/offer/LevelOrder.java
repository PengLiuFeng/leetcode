package com.pengliufeng.leetcode.offer;


import java.util.*;

public class LevelOrder {
    public int[] levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<Integer> resultList = new ArrayList<>();
        if (null == root){
            return new int[0];
        }
        queue.offer(root);
        while (Boolean.FALSE.equals(queue.isEmpty())){
            TreeNode resource = queue.poll();
            if (!Objects.isNull(resource.left)){
                queue.offer(resource.left);
            }
            if (!Objects.isNull(resource.right)) {
                queue.offer(resource.right);
            }
            resultList.add(resource.val);
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}
