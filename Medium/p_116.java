class Solution {
    public Node connect(Node root) {
        if(root==null) return root;
        Node front=root,temp=null,record=front;
        while(front.left!=null){
            record=front.left;
            temp=front.left;
            temp.next=front.right;
            temp=temp.next;
            front=front.next;
            while(front!=null){
                temp.next=front.left;
                temp=temp.next;
                temp.next=front.right;
                temp=temp.next;
                front=front.next;
            }
            front=record;
        }
        return root;
    }
}
