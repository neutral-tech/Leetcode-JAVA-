class Solution {
    public int numberOfBeams(String[] bank) {
        if(bank.length<2) return 0;
        int i=0,j=1;
        int total=0;
        int first=0,second=0;
        while(j<bank.length){
            first=count(bank[i]);
            second=count(bank[j]);
            if(first==0&&second==0){
                i=j+1;
                j=i+1;
            }
            else if(first==0){
                i=j;
                j=i+1;
            }
            else if(second==0){
                j=j+1;
            }
            else{
                i=j;
                j=j+1;
                total=total+first*second;
            }
        }
        return total;
    }
    
    public int count(String word){
        int m=0,temp=00;
        while(m<word.length()){
            if(word.charAt(m)=='1') temp++;
            m++;
        }
        return temp;
    }
}

