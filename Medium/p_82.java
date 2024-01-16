class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode temp=head,previous=null;
        int count=0,i=0,top=-1;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        ListNode[] stack=new ListNode[count];
        temp=head;
        while(temp!=null){
            if(top==-1){
                if(previous==null||previous.val!=temp.val){
                top++;
                stack[top]=temp;
                }
            }
            else{
                if(previous!=null&&temp.val==previous.val){

                }
                else if(temp.val==stack[top].val){
                    previous=stack[top];
                    top--;
                } 
                else {
                    top++;
                stack[top]=temp;
                }
            }
            temp=temp.next;
        }
        if(top==-1) return null;
        i=0;
        while(i<top){
            stack[i].next=stack[i+1];
            i++;
        }
        stack[i].next=null;
        return stack[0];
    }
}

