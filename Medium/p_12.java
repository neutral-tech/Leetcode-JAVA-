class Solution {
    public String intToRoman(int num) {
        int[] value=new int[13];
        String[] symbol=new String[13];
        value[0]=1;
        symbol[0]="I";
        value[1]=4;
        symbol[1]="IV";
        value[2]=5;
        symbol[2]="V";
        value[3]=9;
        symbol[3]="IX";
        value[4]=10;
        symbol[4]="X";
        value[5]=40;
        symbol[5]="XL";
        value[6]=50;
        symbol[6]="L";
        value[7]=90;
        symbol[7]="XC";
        value[8]=100;
        symbol[8]="C";
        value[9]=400;
        symbol[9]="CD";
        value[10]=500;
        symbol[10]="D";
        value[11]=900;
        symbol[11]="CM";
        value[12]=1000;
        symbol[12]="M";

        String roman="";
        int i=12;
        while(num>0){
            if(num>=value[i]){
                num=num-value[i];
                roman=roman+symbol[i];
            }
            else i--;
        }
        return roman;
    }
}
