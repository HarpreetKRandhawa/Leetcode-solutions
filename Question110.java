//Given a binary tree, determine if it is height-balanced.
//For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of 
//every node never differ by more than 1.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }
    public int checkHeight(TreeNode root){
        if(root == null)
            return 0;
        int leftHeight = checkHeight(root.left);
        if(leftHeight == -1)
            return -1;
        int rightHeight = checkHeight(root.right);
        if(rightHeight == -1)
            return -1;
        if(Math.abs(leftHeight - rightHeight) > 1)
            return -1;
        return 1+Math.max(leftHeight,rightHeight);
    }
}
