
//Optimized solution
class Solution {
    public int climbStairs(int n) {
        if(n<1) return 0;
        int first=1,second=1,i,now=1;
        for(i=1;i<n;i++){
            now=first+second;
            first=second;
            second=now;
        }
        return now;
    }
}


class Solution {
    int[] memo;
    public int climbStairs(int n) {
        if(n<3) return n;
        memo=new int[n+1];
        int i=0;
        while(i<=n){
            memo[i]=-1;
            i++;
        }
        memo[0]=0;
        memo[1]=1;
        memo[2]=2;
        return count(n);
    }
    private int count(int n){
        if(memo[n]!=-1) return memo[n];
        memo[n]=count(n-1)+count(n-2);
        return memo[n];
    }
}
