class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode temp=root;
        while(temp!=null&&temp.val!=val){
            if(temp.val>val) temp=temp.left;
            else if(temp.val<val) temp=temp.right;
        }
        if(temp==null) return null;
        return temp;
    }
}
