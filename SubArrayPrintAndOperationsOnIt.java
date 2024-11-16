import java.util.Scanner;
/*
1. we are taking input from user
2. printing subarrays
3. Counting the subArrays.
4. finding the Minimum and Maximum sum of subarrays.
*/
public class PrintSubArrays {
    
    public static void subArrays(int[] num) {
        int n = num.length;
        int ts=0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
              for (int j=i; j<n; j++){
                  int subSum =0;
                   for(int k =i; k<=j; k++) {
                     // 2. printing subarrays
                      System.out.print(num[k]);
                      subSum +=num[k];
                   }
                //4. finding the Minimum and Maximum sum of subarrays.
                   if(subSum < min){
                       min = subSum;
                   }
                   if(subSum > max){
                      max = subSum;
                   }
               // 3. Counting the subArrays.
                   ts++;
                   System.out.println();
              }
              System.out.println();
        }
        System.out.println("Total sub Arrays : "+ts);
        System.out.println("The min value of subArrays is : "+min);
        System.out.println("The max value of subArrays is : "+max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] num = new int[n];
        //take input 1. we are taking input from user
        for (int i=0; i<n; i++) {
            num[i] = sc.nextInt();
        }

        subArrays(num);
    }
}
