import java.util.Scanner;

public class SevenCount {
    public static int countOfSeven(int matrix[][]){
        int row = matrix.length;
        int col = matrix[0].length;
        int count =0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j] == 7){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];

        //Take input
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int count = countOfSeven(matrix);
        System.out.println(count);
    }
}
