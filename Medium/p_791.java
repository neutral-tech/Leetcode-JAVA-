class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        int i=0,temp=0,j=0;
        while(i<s.length()){
            if(!map.containsKey(s.charAt(i))) map.put(s.charAt(i),1);
            else{
               temp=map.get(s.charAt(i));
               map.put(s.charAt(i),temp+1);
            }
            i++;
        }
        i=0;
        String str="";
        while(i<order.length()){
            if(map.containsKey(order.charAt(i))){
                temp=map.get(order.charAt(i));
                for(j=0;j<temp;j++){
                   str=str+order.charAt(i);
                }
                map.remove(order.charAt(i));
            }
            i++;
        }
        i=0;
        while(i<s.length()){
            if(map.containsKey(s.charAt(i))){
                temp=map.get(s.charAt(i));
                for(j=0;j<temp;j++){
                   str=str+s.charAt(i);
                }
                map.remove(s.charAt(i));
            }
            i++;
        }
        return str;
    }
}
