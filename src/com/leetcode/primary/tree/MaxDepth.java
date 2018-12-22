package com.leetcode.primary.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author BaoZhou
 * @date 2018/12/12
 */
public class MaxDepth {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            TreeNode root = Wrapper.stringToTreeNode(line);
            Wrapper.prettyPrintTree(root);
            System.out.println(maxDepth(root));
        }
    }

    public static int maxDepth(TreeNode root) {
        return root == null ? 0 : (1 + Math.max(maxDepth(root.left), maxDepth(root.right)));
    }

}
