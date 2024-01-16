class Solution {
    int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        rangeSum(root,low,high);
        return sum;
    }
    public void rangeSum(TreeNode root,int low,int high){
        if(root==null) return;
        if(root.val<low){
            rangeSum(root.right,low,high);
        }
        else if(root.val>high){
            rangeSum(root.left,low,high);
        }
        else{
            sum=sum+root.val;
            rangeSum(root.right,low,high);
            rangeSum(root.left,low,high);
        }
        return;
    }
}
