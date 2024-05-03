class Solution {
    public int compareVersion(String version1, String version2) {
        int m=version1.length(),n=version2.length(),i=0,j=0,p1=0,p2=0,r=0;
        while(i<m&&j<n){
            while(i!=m && version1.charAt(i)!='.') i++;
            while(j!=n && version2.charAt(j)!='.') j++;
            r=check(version1.substring(p1,i),version2.substring(p2,j));
            if(r!=0) return r;
            i++;
            j++;
            p1=i;
            p2=j;
        }
        if(i<m){
            while(i<m){
               while(i!=m && version1.charAt(i)!='.') i++;
               r=check(version1.substring(p1,i),"0");
               if(r!=0) return r;
               i++;
               p1=i; 
            }
        }
        else if(j<n){
            while(j<n){
               while(j!=n && version2.charAt(j)!='.') j++;
               r=check("0",version2.substring(p2,j));
               if(r!=0) return r;
               j++;
               p2=j; 
            }
        }
        return 0;
    }
    private int check(String a,String b){
        if(a.equals(b)) return 0;
        int m=0,n=0,i=0,j=0;
        while(i<a.length()&&j<b.length()){
            m=m*10+a.charAt(i)-48;
            n=n*10+b.charAt(j)-48;
            i++;
            j++;
        }
        if(i<a.length()){
            while(i<a.length()){
                m=m*10+a.charAt(i)-48;
                i++;
            }
        }
        else if(j<b.length()){
            while(j<b.length()){
                n=n*10+b.charAt(j)-48;
                j++;
            }
        }
        if(m==n) return 0;
        else if(m<n) return -1;
        return 1;
    }
}
