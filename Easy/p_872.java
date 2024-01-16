class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1==null&&root2==null) return true;
        else if(root1==null||root2==null) return false;
        ArrayList<Integer> first=new ArrayList<Integer>();
        ArrayList<Integer> second=new ArrayList<Integer>();
        fill(first,root1);
        fill(second,root2);
        if(first.size()!=second.size()) return false;
        int i=0;
        while(i<first.size()){
            if(first.get(i)!=second.get(i)) return false;
            i++;
        }
        return true;
    }
    public void fill(ArrayList<Integer> temp,TreeNode root){
        if(root==null) return;
        fill(temp,root.left);
        if(root.left==null&&root.right==null) temp.add(root.val);
        fill(temp,root.right);
        return;
    }
}
