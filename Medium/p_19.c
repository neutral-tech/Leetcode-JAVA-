struct ListNode* removeNthFromEnd(struct ListNode* head, int n){
    if(head==NULL){
        return head;
    }
    struct ListNode *temp=head,*point,*back;
    int count=0,position,i;
    while(temp!=NULL){
        count++;
        temp=temp->next;
    }
    temp=head;
    position=count-n+1;
    if(position==1){
        head=head->next;
        free(temp);
        return head;
    }
    for(i=2;i<position;i++){
        temp=temp->next;
    }
    point=temp->next;
    back=point->next;
    temp->next=back;
    free(point);
    return head;
}

