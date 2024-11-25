import java.util.Scanner;

public class SecondRowSum {

    
    public static void printSecondRowSum(int matrix[][]){
        if(matrix.length < 2){
            return;
        }
        int sum =0;
        for(int j =0; j<matrix[0].length; j++){
            sum += matrix[1][j];
        }
        System.out.println("The sum of second row elements is : "+sum);
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

        printSecondRowSum(matrix);

    }
}
