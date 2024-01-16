class Solution {
    public String smallestNumber(String pattern) {
        if(pattern.isEmpty()) return null;
        int i=1,latest=0,first=-1,last=-1,temp=0;
        char previous='a';
        int[] arr=new int[pattern.length()+1];
        if(pattern.charAt(0)=='D'){
            first=0;
            last=0;
            previous='D';
        }
        else{
            latest++;
            arr[0]=latest;
            previous='I';
        }
        for(i=1;i<pattern.length();i++){
            if(pattern.charAt(i)=='I'){
                if(previous=='I'){
                    latest++;
                    arr[i]=latest;
                }
                else{
                    for(temp=last+1;temp>=first;temp--){
                        latest++;
                        arr[temp]=latest;
                    }
                    first=-1;
                }
                previous='I';
            }
            else{
                if(previous=='D'){
                    last=i;
                }
                else{
                    first=i;
                    last=i;
                }
                previous='D';
            }
        }
        i=pattern.length()-1;
        if(pattern.charAt(i)=='I'){
            latest++;
            arr[pattern.length()]=latest;
        }
        else{
            for(temp=last+1;temp>=first;temp--){
                latest++;
                arr[temp]=latest;
            }
        }
        String str="";
        i=0;
        while(i<arr.length){
            str=str+(char)(arr[i]+48);
            i++;
        }
        return str;
    }
}

