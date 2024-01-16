class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null||head.next==null) return head;
        ListNode temp=head,first=null,second=null,store1=null,store2=null;
        while(temp!=null){
            if(temp.val<x){
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
            temp=temp.next;
        }
        if(first==null&&second!=null){
            second.next=null;
            return store2;
        }
        else if(first!=null&&second==null){
            first.next=null;
            return store1;
        }
        else{
            second.next=null;
            first.next=store2;
            return store1;
        }
    }
}
