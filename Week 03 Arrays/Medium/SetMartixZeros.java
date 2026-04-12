class Solution {
    public void setZeroes(int[][] matrix) {
        // m rows and n columns

        int m = matrix.length; // rows
        int n = matrix[0].length; // columns

        //create row marker array
        boolean[] row = new boolean[m];
        boolean[] column = new boolean[n];
        
        //marking the elements for zeroing off
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        //making the elements zero
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(row[i] || column[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}