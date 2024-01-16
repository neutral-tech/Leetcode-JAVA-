class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null||head.next.next==null) return head;
        ListNode temp=head,first=null,second=null,store1=null,store2=null;
        int flag=0;
        while(temp!=null){
           if(flag%2==0){
               if(first==null){
                   first=temp;
                   store1=temp;
               }
               else{
                   first.next=temp;
                   first=first.next;
               }
           }
           else{
               if(second==null){
                   second=temp;
                   store2=temp;
               }
               else{
                   second.next=temp;
                   second=second.next;
               }
           }
           flag++;
           temp=temp.next;
        }
        second.next=null;
        first.next=store2;
        return store1;
    }
}

