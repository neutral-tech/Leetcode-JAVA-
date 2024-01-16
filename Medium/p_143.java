class Solution {
    public void reorderList(ListNode head) {
        if(head==null||head.next==null) return;
        ListNode temp=head,front=head;
        int count=0,i=0,jump=0,top=0,size=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        if(count%2==0) jump=count/2;
        else if(count%2==1) jump=(count/2)+1;
        i=0;
        while(i<jump){
            temp=temp.next;
            i++;
        }
        size=count-jump;
        ListNode[] last=new ListNode[size];
        i=0;
        while(temp!=null){
            last[i]=temp;
            i++;
            temp=temp.next;
        }
        temp=head;
        front=temp.next;
        top=size-1;
        i=1;
        while(top!=-1){
            if(i%2==1){
                temp.next=last[top];
                top--;
                temp=temp.next;
            }
            else{
                temp.next=front;
                front=front.next;
                temp=temp.next;
            }
            i++;
        }
        if(count%2==1){
            temp.next=front;
            temp=temp.next;
            temp.next=null;
        }
        else temp.next=null;
        return;
        
    }
}
