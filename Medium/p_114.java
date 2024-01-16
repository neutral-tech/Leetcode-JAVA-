class Solution {
    TreeNode head=null;
    public void flatten(TreeNode root) {
        if(root==null||(root.left==null&&root.right==null)) return;
        modify(root);
        return;
    }
    public void modify(TreeNode root){
        if(root==null) return;
        modify(root.right);
        modify(root.left);
        root.right=head;
        root.left=null;
        head=root;
        return;
    }
}
