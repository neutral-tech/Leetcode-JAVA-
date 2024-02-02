class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> store;
        store=new ArrayList<Integer>();
        int c1=count(low),c2=count(high);
        int digit=0,counter=0,i=0,num=0,temp=0;
        for(digit=c1;digit<=c2;digit++){
            for(i=1;i<=9;i++){
             num=0;
             counter=0;
             temp=i;
             if((i+digit)>10) break;
             while(counter<digit){
                 num=num*10+temp;
                 temp++;
                 counter++;
             }
             if(num<low) continue;
             else if(num>high) break;
             else store.add(num);
            }
        }
        return store;
    }
    private int count(int n){
        int a=0;
        while(n>0){
            a++;
            n=n/10;
        }
        return a;
    }
}
