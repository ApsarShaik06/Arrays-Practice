public class DiagonalSum {
    
    public static int diagonalSum(int matrix[][]){
        int sum =0;
        /*
         * Below code Time Complexity is O(n^2)
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(i == j){ // primary diagonal
                    sum += matrix[i][j];
                } else if(i+j == matrix.length-1){ // secondary diagnal
                    sum += matrix[i][j];
                }
            }
        }
         */

         //Below code Time Complexity is O(n)
         for(int i=0; i<matrix.length; i++){
            // primary diagonal
            sum += matrix[i][i]; // i = j so, inplace of j will use i only

            if(i != (matrix.length-1-i)){  // i+j = n -1 --> j = n-1-i, so inplace of j, will substitute (n-1-i)
                sum += matrix[i][matrix.length-1-i];
            }
         }
        return sum;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int dSum = diagonalSum(matrix);
        System.out.println("The diagonal sum is : "+dSum);
    }
}
