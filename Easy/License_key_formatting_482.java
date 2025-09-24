class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String[] temp=s.split("-");
        String str="";
        for(String s1:temp){
            str+=s1.toUpperCase();
        }
        StringBuffer fin=new StringBuffer();
        int count=0;
        for(int i=str.length()-1;i>=0;i--){
            if(count<k){
                fin.append(str.charAt(i));
                count++;
            }
            else{
                fin.append("-");
                fin.append(str.charAt(i));
                count=1;
            }

        }
        return fin.reverse().toString();
        
    }
}
