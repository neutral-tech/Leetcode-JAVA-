class Solution {
    public String maximumOddBinaryNumber(String s) {
        int one=0,i=0,size=s.length();
        if(size==1){
            return s;
        }
        for(i=0;i<size;i++){
            if(s.charAt(i)=='1'){
                one++;
            }
        }
        String str="";
        if(one==1){
            str=str+"0";
            for(i=1;i<size-one;i++){
                str=str+"0";
            }
            str=str+"1";
            return str;
        }
        
        for(i=1;i<=one-1;i++){
            str=str+"1";
        }
        if(one==size){
            str=str+"1";
            return str;
        }
        str=str+"0";
        for(i=1;i<size-one;i++){
            str=str+"0";
        }
        str=str+"1";
        return str;
    }
}

