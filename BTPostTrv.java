// post order traversal of binary tree
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        trv(root, list);
        return list;
    }

    private void trv(TreeNode root, List<Integer> list){
        if(root == null) return;
        trv(root.left, list);
        trv(root.right, list);
        list.add(root.val);
    }
}
