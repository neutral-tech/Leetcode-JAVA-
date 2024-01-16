class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0) return head;
        ListNode temp=head,store=head;
        int count=0,i=1;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        k=k%count;
        if(k==0) return head;
        temp=head;
        while(i<count-k){
            temp=temp.next;
            i++;
        }
        store=temp.next;
        temp.next=null;
        temp=head;
        head=store;
        while(store.next!=null){
            store=store.next;
        }
        store.next=temp;
        return head;
    }

}

