class Solution {
    public ListNode deleteMiddle(ListNode head) {
        int count=0;
        if(head==null||head.next==null){
            head=null;
            return head;
        }
        ListNode temp=head,point;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        count=count/2;
        temp=head;
        while(count!=1){
            temp=temp.next;
            count--;
        }
        point=temp.next;
        point=point.next;
        temp.next=point;
        return head;
    }
}

