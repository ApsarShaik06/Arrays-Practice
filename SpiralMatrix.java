import java.util.LinkedList;
import java.util.List;

public class SpiralMatrix {
        public static List<Integer> spiralOrder(int[][] matrix) {
        int startRow =0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;
        List<Integer> ans = new LinkedList<>();
        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int j = startCol; j<= endCol; j++){
                ans.add(matrix[startRow][j]);
            }

            //right
            for(int i=startRow+1; i<=endRow; i++){
                ans.add(matrix[i][endCol]);
            }

            //down
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow == endRow){
                    break;
                }
                
                ans.add(matrix[endRow][j]);
            }


            //left
            for(int i=endRow-1; i>= startRow+1; i--){
                if(startCol == endCol){
                    break;
                }

                ans.add(matrix[i][startCol]);
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20},{21,22,23,24}};
        List<Integer> ans = spiralOrder(matrix);

        for (Integer integer : ans) {
            System.out.print(integer+" ");
        }
    }
}
