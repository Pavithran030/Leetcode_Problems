class Solution {
    public String reverseStr(String s, int k) {
        int len=s.length();
        char[] reverse=s.toCharArray();
        for(int i=0;i<len;i+=2*k){
            int left=i;
            int right=i+(k-1)>= len? len-1: i+(k-1);

            while(left<right){
                char temp=reverse[left];
                reverse[left]=reverse[right];
                reverse[right]=temp;
                right--;
                left++;
            }
        }
        return new String(reverse);
        
    }
}
