package com.leetcode.middle.tree;

import com.leetcode.leetcodeutils.TreeNode;
import com.leetcode.leetcodeutils.TreeWrapper;

import java.util.ArrayList;
import java.util.List;

/**
 * @author BaoZhou
 * @date 2019/1/3
 */
public class KthSmallest {
    public static void main(String[] args) {
        TreeNode root = TreeWrapper.stringToTreeNode("[4,2,5,1,3]");
        TreeWrapper.prettyPrintTree(root);
        System.out.println(kthSmallest(root, 5));
    }

    public static int kthSmallest(TreeNode root, int k) {
        dfs(root);
        return list.get(k - 1);
    }

    static List<Integer> list = new ArrayList();

    public static void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        list.add(root.val);
        dfs(root.right);
    }

}
