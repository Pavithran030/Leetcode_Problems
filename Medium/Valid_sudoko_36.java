class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet <String> sudo=new HashSet<>();

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                char dot=board[i][j];
                if(dot=='.') continue;
                String ro=dot+"found in row"+i;
                String col=dot+"found in col"+j;
                String box=dot+"found in the box "+(i/3)+"-"+(j/3);

                if(!sudo.add(ro) || !sudo.add(col) || !sudo.add(box)){
                    return false;
                }
            }
        }
        return true;
    }
}
