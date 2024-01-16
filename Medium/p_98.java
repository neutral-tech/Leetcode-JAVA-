class Solution {
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> nums=new ArrayList<Integer>();
        nums=store(root,nums);
        int i=0;
        while(i<nums.size()-1){
            if(nums.get(i+1)<=nums.get(i)) return false;
            i++;
        }
        return true;
    }
    public ArrayList<Integer> store(TreeNode root,ArrayList<Integer> nums){
        if(root==null) return nums;
        nums=store(root.left,nums);
        nums.add(root.val);
        nums=store(root.right,nums);
        return nums;
    }
}
