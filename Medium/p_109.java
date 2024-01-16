class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        ListNode temp=head;
        int size=0,i=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int[] arr=new int[size];
        temp=head;
        while(temp!=null){
             arr[i]=temp.val;
             temp=temp.next;
             i++;
        }
        return convert(arr,0,size-1);
    }
    public static TreeNode convert(int[] arr,int first,int last){
        if(first>last) return null;
        int mid=first+(last-first)/2;
        TreeNode abc=new TreeNode(arr[mid]);
        abc.left=convert(arr,first,mid-1);
        abc.right=convert(arr,mid+1,last);
        return abc;
    }
    
}
