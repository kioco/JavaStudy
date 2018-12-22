package com.leetcode.primary.tree;

/**
 * 验证二叉搜索树
 *
 * @author BaoZhou
 * @date 2018/12/12
 */
public class IsValidBST {
    public static void main(String[] args) {
        TreeNode root = Wrapper.stringToTreeNode("[10,5,15,null,null,6,20]");
        Wrapper.prettyPrintTree(root);
        System.out.println(isValidBST(root));
    }

    public static boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean valid(TreeNode root, long low, long high) {
        if (root == null) {
            return true;
        }
        if (root.val <= low || root.val >= high) {
            return false;
        }
        return valid(root.left, low, root.val) && valid(root.right, root.val, high);
    }

}
