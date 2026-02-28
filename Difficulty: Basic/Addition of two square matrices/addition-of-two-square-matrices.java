// User function Template for Java

class Solution {
    public int [][] Addition(int[][] matrixA, int[][] matrixB) {
        // code here
        int m=matrixA.length;
        int n=matrixA[0].length;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
             matrixA[i][j] = matrixA[i][j] + matrixB[i][j];   
            }
        }
      return matrixA;
      }  
    
}