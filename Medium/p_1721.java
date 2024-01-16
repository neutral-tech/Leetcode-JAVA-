class Solution {
    public ListNode swapNodes(ListNode head, int k) {
       if(head==null||head.next==null) return head;
       ListNode temp=head,store=head;
       int count=0,i=0,j=0;
       while(temp!=null){
           count++;
           temp=temp.next;
       }
       ListNode[] stack=new ListNode[count];
       temp=head;
       while(temp!=null){
           stack[i]=temp;
           i++;
           temp=temp.next;
       }
       j=count-k;
       i=k-1;
       store=stack[i];
       stack[i]=stack[j];
       stack[j]=store;
       i=0;
       while(i<count-1){
           stack[i].next=stack[i+1];
           i++;
       }
       stack[i].next=null;
       return stack[0];
    }
}

