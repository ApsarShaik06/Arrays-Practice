import java.util.*;
public class ArraysCC {

   public static int findLargest(int[] numbers) {
       int max = Integer.MIN_VALUE;
       
       for(int i=0; i<numbers.length; i++){
           if(max < numbers[i]){
            max = numbers[i];
           }
       }

       return max;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];

        // Taking input of numbers from user
        for (int i=0; i<numbers.length; i++) { // instead of numbers.length, we can use "n" here.
            numbers[i] = sc.nextInt();
        }
        int maxEle = findLargest(numbers);
        System.out.println("The largest number is : "+maxEle);
  
    }
}
