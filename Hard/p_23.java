class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length<1) return null;
        else if(lists.length<2) return lists[0];
        ListNode head=new ListNode();
        ListNode temp=head;
        int i=0,n=lists.length,j=n-1,count=0;
        while(i<=j){
            if(lists[i]==null){
                while(lists[j]==null){
                    j--;
                    count++;
                    if(j<0) return null;
                }
                if(i<j) swap(lists,i,j);
            }
            i++;
        }
        n=n-count;
        if(n==1) return lists[0];
        heapify(lists,n);
        while(n>1){
            head.next=lists[0];
            head=head.next;
            lists[0]=lists[0].next;
            if(lists[0]==null) n=deletion(lists,n);
            insertion(lists,n);
        }
        while(lists[0]!=null){
            head.next=lists[0];
            head=head.next;
            lists[0]=lists[0].next;
        }
        return temp.next;
    }
    private void heapify(ListNode[] arr,int n){
        int i=0,parent=0,current=0;
        ListNode temp=null;
        while(i<n){
            current=i;
            parent=(i-1)/2;
            while(arr[current].val<arr[parent].val){
                swap(arr,current,parent);
                current=parent;
                parent=(current-1)/2;
                if(current==0) break;
            }
            i++;
        }
        return;
    }
    
    private void insertion(ListNode[] arr,int n){
        int i=0,first=2*i+1,second=2*i+2;
        int min=0;
        while(first<n && second<n){
            min=minimum(arr,first,second);
            if((arr[i].val)>(arr[min].val)){
                swap(arr,i,min);
                i=min;
                first=2*i+1;
                second=2*i+2;
            }
            else break;
        }
        if(first<n){
            if(arr[i].val>arr[first].val) swap(arr,i,first);
        }
    }
    
    private int deletion(ListNode[] arr,int n){
        arr[0]=arr[n-1];
        return (n-1);
    }

    private int minimum(ListNode[] arr,int a,int b){
        if(arr[a].val<arr[b].val) return a;
        return b;
    }

    private void swap(ListNode[] arr,int a,int b){
        ListNode temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        return;
    }
}
