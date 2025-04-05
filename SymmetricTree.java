/*
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

Example 1:

Input: root = [1,2,2,3,4,4,3]
Output: true
*/ 

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) return true;
        if(root.left != null && root.right != null) return helper(root.left, root.right);
        return  false;
    }

    private boolean helper(TreeNode rL, TreeNode rR){
        if(rL == null && rR == null) return true;
        if(rL != null && rR != null && rL.val == rR.val) 
            return helper(rL.left, rR.right) && helper(rL.right, rR.left);
        return false;  
    }
}
