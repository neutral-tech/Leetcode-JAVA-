class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int i=0,sum=0;
        while(i<tickets.length){
            if(i<=k){
                if(tickets[i]<=tickets[k]) sum=sum+tickets[i];
                else sum=sum+tickets[k];
            }
            else{
                if(tickets[i]<tickets[k]) sum=sum+tickets[i];
                else sum=sum+tickets[k]-1;
            }
            i++;
        }
        return sum;
    }
}
