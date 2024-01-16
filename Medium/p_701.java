class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            root=new TreeNode(val);
            root.left=null;
            root.right=null;
            return root;
        }
        TreeNode temp=root,store=root;
        while(temp!=null){
            store=temp;
            if(temp.val>val) temp=temp.left;
            else if(temp.val<val) temp=temp.right;
        }
        temp=new TreeNode(val);
        temp.left=null;
        temp.right=null;
        if(store.val>val) store.left=temp;
        else store.right=temp;
        return root;
    }
}

