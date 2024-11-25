import java.util.Scanner;

public class Transpose {

    public static void printArray(int[][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
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

        int[][] transpose = new int[c][r];
        for(int i=0; i<transpose.length; i++){
            for(int j=0; j<transpose[0].length; j++){
                transpose[i][j] = matrix[j][i];
            }
        }
        printArray(transpose);
    }
}
