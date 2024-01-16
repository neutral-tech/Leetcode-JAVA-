class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> nums=new ArrayList<Integer>();
        nums=inorder(root,k,nums);
        return nums.get(nums.size()-1);
    }
    public ArrayList<Integer> inorder(TreeNode root,int k,ArrayList<Integer> nums){
        if(root==null) return nums;
        else if(nums.size()==k) return nums;
        
        nums=inorder(root.left,k,nums);
        if(nums.size()<k)nums.add(root.val);
        nums=inorder(root.right,k,nums);
        return nums;
        
    }
}
