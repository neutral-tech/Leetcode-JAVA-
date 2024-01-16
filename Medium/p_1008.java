class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
       TreeNode head=new TreeNode(preorder[0]);
       TreeNode temp=head;
       int i=1;
       while(i<preorder.length){
           if(preorder[i]>preorder[i-1]) break;
           TreeNode abc=new TreeNode(preorder[i]);
           temp.left=abc;
           temp=temp.left;
           i++;
       }
       while(i<preorder.length){
           head=insert(head,preorder[i]);
           i++;
       }
       return head; 
    }
    public TreeNode insert(TreeNode root,int key){
        if(root==null){
            root=new TreeNode(key);
            return root;
        }
        else if(key<root.val){
            root.left=insert(root.left,key);
        }
        else if(key>root.val){
            root.right=insert(root.right,key);
        }
        return root;
    }
}

