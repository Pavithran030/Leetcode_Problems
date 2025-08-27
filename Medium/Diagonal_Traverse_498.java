class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        int m=mat.length,n=mat[0].length;
        int[] arr=new int[m*n];
        int row=0,col=0;
        int i=0;  // array position
        boolean up=true;   // for direction switch

        while(row<m && col<n){
            if(up){
                while(row>0 && col<n-1){
                    arr[i++]=mat[row][col];
                    row--;
                    col++;
                }
                arr[i++]=mat[row][col];
                if(col==n-1){
                    row++;
                }
                else col++;
            }
            else{
                while(col>0 && row<m-1){
                    arr[i++]=mat[row][col];
                    row++;
                    col--;
                }
                arr[i++]=mat[row][col];
            if(row==m-1){
                col++;
            }
            else{
                row++;
            }
        }
        up=!up; // to reverse the direction
        }
        return arr;
    }
}
