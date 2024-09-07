class Solution {
    public void setZeroes(int[][] matrix) {
        int col[]=new int[matrix[0].length];
        int m = col.length;
        int row[]=new int[matrix.length];
        int n=row.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }   
    }
}