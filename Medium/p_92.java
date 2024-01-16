class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null||head.next==null||left==right) return head;
        ListNode temp=head,leftnode=head,rightnode=head,back=head; 
        int i=1;
        while(i<=right){
            if(i==left-1) back=temp;
            else if(i==left) leftnode=temp;
            else if(i==right) rightnode=temp;
            temp=temp.next;
            i++;
        }
        reverse(leftnode,rightnode);
        leftnode.next=temp;
        if(back==leftnode) return rightnode;
        back.next=rightnode;
        return head;
    }
    public void reverse(ListNode left,ListNode right){
        ListNode previous=left,point=left.next,back=point.next;
        while(back!=right.next){
            point.next=previous;
            previous=point;
            point=back;
            back=point.next;
        }
        point.next=previous;
        return;
    }
}

