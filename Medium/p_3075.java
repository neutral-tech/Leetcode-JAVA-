class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n=happiness.length,i=0;
        long total=0;
        while(k>0){
            happiness[n-1-i]=happiness[n-1-i]-i;
            if(happiness[n-1-i]>0) total=total+happiness[n-1-i];
            i++;
            k--;
        }
        return total;
    }
}
