class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder re=new StringBuilder();

        while(columnNumber >0){
            columnNumber--;
            char ch=(char)('A'+columnNumber%26);
            re.insert(0,ch);
            columnNumber/=26;
        }
        return re.toString();
    }
}
