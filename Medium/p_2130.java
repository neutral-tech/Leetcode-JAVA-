class Solution {
    public int pairSum(ListNode head) {
        if(head==null) return 0;
        int count=0,i=0,max=0,sum=0;
        ListNode temp=head,store=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        ListNode[] arr=new ListNode[count];
        temp=head;
        while(temp!=null){
            arr[i]=temp;
            i++;
            temp=temp.next;
        }
        i=0;
        while(i<=(count/2)-1){
            sum=arr[i].val+arr[count-1-i].val;
            if(sum>max) max=sum;
            i++;
        }
        return max;
    }
}
