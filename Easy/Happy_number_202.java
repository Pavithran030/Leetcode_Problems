class Solution {
    public boolean isHappy(int n) {
        int count=0;
        int sum=0;
        while(n!=1 &&count<=10){
            sum=0;
            while(n!=0){
                int digit=n%10;
                sum+=(digit*digit);
                n/=10;
            }
            count++;
            n=sum;
        }
        if(sum==1  || n==1){
            return true;
        }
        else return false;
    }
}
