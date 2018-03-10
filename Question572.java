/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null)
            return false;
        if(isSubtreeHelper(s,t))
            return true;
        return isSubtree(s.left,t) || isSubtree(s.right,t);
    }
    private boolean isSubtreeHelper(TreeNode s, TreeNode t){
        if(s == null && t == null)
            return true;
        if(s == null || t == null)
            return false;
        if(s.val != t.val)
            return false;
        return isSubtreeHelper(s.left,t.left) && isSubtreeHelper(s.right,t.right);
    }
}