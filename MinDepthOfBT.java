/*
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

Example 1:

Input: root = [3,9,20,null,null,15,7]
Output: 2
Example 2:

Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5
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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int min_height[] = new int[1];
        min_height[0] = Integer.MAX_VALUE;
        helper(root, min_height, 1);
        return min_height[0];
    }

    private void helper(TreeNode root, int minH[], int currH){
        //if we reach to leaf node so we update the minh if currh is min
        if(root.left == null && root.right == null)
            minH[0] = (currH < minH[0]) ? currH : minH[0];

        if(root.left != null) helper(root.left, minH, currH + 1);
        if(root.right != null) helper(root.right, minH, currH + 1); 
    }
}
