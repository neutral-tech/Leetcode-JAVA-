class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        return convert(nums,0,nums.length-1);
    }
    public static TreeNode convert(int[] nums,int first,int last){
        if(first>last) return null;
        int mid=first+(last-first)/2;
        TreeNode abc=new TreeNode(nums[mid]);
        abc.left=convert(nums,first,mid-1);
        abc.right=convert(nums,mid+1,last);
        return abc;
    }
}
