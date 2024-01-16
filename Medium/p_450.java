class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode temp=root,store=root;
        while(temp!=null){
            if(temp.val==key) break;
            store=temp;
            if(temp.val<key) temp=temp.right;
            else temp=temp.left;
        }
        if(temp==null) return root;
        if(temp.right==null){
            if(store==temp) root=temp.left;
            else if(store.right==temp) store.right=temp.left;
            else if(store.left==temp) store.left=temp.left;
            return root;
        }
        if(store==temp) root=temp.right;
        else if(store.left==temp) store.left=temp.right;
        else if(store.right==temp) store.right=temp.right;
        store=temp.left;
        temp=temp.right;
        while(temp!=null&&temp.left!=null) temp=temp.left;
        if(temp!=null) temp.left=store;
        return root;
    }
}

