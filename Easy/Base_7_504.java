class Solution {
    public String convertToBase7(int num) {

        if(num==0) return "0";

        int sign =1;
        if(num<0) sign=-1;

        num=Math.abs(num);
        StringBuilder str=new StringBuilder();

        while(num!=0){
            int rem=num%7;
            str.insert(0,rem);
            num/=7;
        }

        return sign==-1 ?"-"+str.toString() : str.toString();
        
    }
}
