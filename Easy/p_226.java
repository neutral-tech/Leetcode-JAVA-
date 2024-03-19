class Solution {
    public TreeNode invertTree(TreeNode root) {
        reverse(root);
        return root;
    }
    private void reverse(TreeNode root){
        if(root==null) return;
        else if(root.left==null&&root.right==null) return;
        reverse(root.left);
        reverse(root.right);
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        return;
    }
}
