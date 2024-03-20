class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode previous=null,slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            previous=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        if(previous!=null) previous.next=null;
        return merge(sortList(head),sortList(slow));
    }
    private ListNode merge(ListNode first,ListNode second){
        if(first==null) return second;
        else if(second==null) return first;
        ListNode head=null;
        if(first.val<second.val){
            head=first;
            first=first.next;
        }
        else{
            head=second;
            second=second.next;
        }
        ListNode temp=head;
        while(first!=null&&second!=null){
            if(first.val<second.val){
                temp.next=first;
                first=first.next;
            }
            else{
                temp.next=second;
                second=second.next;
            }
            temp=temp.next;
        }
        if(first==null){
            while(second!=null){
                temp.next=second;
                second=second.next;
                temp=temp.next;
            }
        }
        else if(second==null){
            while(first!=null){
                temp.next=first;
                first=first.next;
                temp=temp.next;
            }
        }
        return head;
    }
}
