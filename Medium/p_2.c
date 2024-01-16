struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2){
   struct ListNode *first=l1,*second=l2;
    int sum=0,carry=0;
    while(first->next!=NULL&&second->next!=NULL){
        sum=first->val+second->val+carry;
        second->val=sum%10;
        carry=sum/10;
        first=first->next;
        second=second->next;
    }
    sum=first->val+second->val+carry;
    second->val=sum%10;
    carry=sum/10;

    if(first->next==NULL){
        if(carry==0){
           return l2; 
        }
        else if(second->next==NULL){
            second->next=(struct ListNode*)malloc(sizeof(struct ListNode));
            second->next->val=carry;
            second->next->next=NULL;
        }
        else{
            second=second->next;
            while(second->next!=NULL){
                sum=second->val+carry;
                second->val=sum%10;
                carry=sum/10;
                if(carry==0){
                    break;
                }
                second=second->next;
            }
            
            if(second->next==NULL){
                sum=second->val+carry;
                second->val=sum%10;
                carry=sum/10;
                if(carry==0){
                    return l2;
                }
                else {
                second->next=(struct ListNode*)malloc(sizeof(struct ListNode));
                second->next->val=carry;
                second->next->next=NULL;
                }
            }
        }
        return l2;

    }

    else{
        first=l1;second=l2;
        while(second->next!=NULL){
            first->val=second->val;
            first=first->next;
            second=second->next;
        }
        first->val=second->val;
        first=first->next;
        if(carry==0){
            return l1;   
        }
        
        else{
            while(first->next!=NULL){
                sum=first->val+carry;
                first->val=sum%10;
                carry=sum/10;
                if(carry==0){
                    break;
                }
                first=first->next;
            }
            if(first->next==NULL){
                sum=first->val+carry;
                first->val=sum%10;
                carry=sum/10;
                if(carry==0){
                    return l1;
                }
                first->next=(struct ListNode*)malloc(sizeof(struct ListNode));
                first->next->val=carry;
                first->next->next=NULL;
            }
        }
        return l1;
    }   
}

