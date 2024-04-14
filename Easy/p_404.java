class Solution {
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        traverse(root,root);
        return sum;
    }
    private void traverse(TreeNode parent,TreeNode now){
        if(now==null) return;
        else if(now.left==null&&now.right==null){
            if(now==parent.left) sum=sum+now.val;
            return;
        }
        traverse(now,now.left);
        traverse(now,now.right);
    }
}
