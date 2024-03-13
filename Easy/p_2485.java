class Solution {
    public int pivotInteger(int n) {
        int m=n*(n+1);
        if((m%2)==1) return -1;
        m=m/2;
        int a=(int)Math.sqrt(m);
        if((a*a)==m) return a;
        else return -1;
    }
}
