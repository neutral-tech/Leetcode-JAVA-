class Solution {
    public boolean evaluateTree(TreeNode root) {
        if(root==null || root.val==0) return false;
        else if(root.val==1) return true;
        if(root.val==2) return evaluateTree(root.left) || evaluateTree(root.right);
        else return evaluateTree(root.left) && evaluateTree(root.right);
    }
}
