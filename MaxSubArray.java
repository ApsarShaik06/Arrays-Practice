import java.util.Scanner;

public class MaxSubArray{

    public static void maxSubarraySumByBruteForce(int[] array){
         // will take every subArray and calculate the evvery sum of subArray and then compare.
         if(array.length == 1){
            // If we have only one value, then that value is the maxValue, so will return here.
            System.out.println("The max SubArray sum is : "+array[0]);
            return;
        }
        
         int n = array.length;
         int maxSum = Integer.MIN_VALUE;
         for(int i=0; i<n; i++){
              for(int j=i; j<n; j++){
                int currSum =0;
                for(int k=i; k<=j; k++){ // taking i as start and j as end.
                    currSum +=array[k]; // calculating each subArray sum
                }
                if(maxSum < currSum){ // comparing eachSub Array sum with maxSum(maxValue).
                    maxSum = currSum;
                }
              }
         }
         System.out.println("The max SubArray sum is : "+maxSum);
    }

    public static void maxStbArraySumByPrefixSum(int[] array){
        if(array.length == 1){
            // If we have only one value, then that value is the maxValue, so will return here.
            System.out.println("The max SubArray sum is : "+array[0]);
            return;
        }
        // will calculate prefix sum and store in an new array
        // 0th index sum will be in 0th index, 0th+1st index sum will be stored in 1st index, (0+1+2) sum will store in 2nd index, and so on
        // the formula is prefix[i-1] + array[i] {sumof pre index and current index index value = will store in prefix[i]}

        int[] prefixSum = new int[array.length];
 
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
        // here we know that 0th index vwlue will store in 0index,so will assign it directly and will start from 1st index.
        prefixSum[0] = array[0];
        for(int i=1; i<prefixSum.length; i++){ 
            prefixSum[i] = prefixSum[i-1] + array[i];
        }

        for(int i=0; i<array.length; i++){
            for(int j=i; j<array.length; j++){
                //sum will calculate as
                //if we want 2nd index to 4th index sum, then [4th] - [2nd-1]
                //     given array = [-1, 3, 3, -1, 4]  --> 3+(-1)+4 = 6
                // prefixSum Array =  [-1, 2, 5, 4, 8] here   prefixSum[4] - prefiSum[2-(1)] = 8 - 2 = 6
                currSum =0;

                currSum = (i == 0)?prefixSum[j] : prefixSum[j] - prefixSum[i-1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }

            }
        }
        System.out.println("The max SubArray sum is : "+maxSum);
    }

    public static void maxSubArraySumByKadanes(int[] array){
           // Kadane's Algorithm : if any negative value is there, make it as zero.
           if(array.length == 1){
             // If we have only one value, then that value is the maxValue, so will return here.
             System.out.println("The max SubArray sum is : "+array[0]);
             return;
           }
           int currSum =0;
           int maxSum = Integer.MIN_VALUE;
           for(int i=0; i<array.length; i++){
               currSum += array[i];

               if(currSum < 0){// if present sum is negative then will amke it as "0".
                  currSum =0;
               }

               if(maxSum < currSum){
                  maxSum = currSum;
               }
           }


           // If the input is all are in negative, then the above login won't work. so, will use below code.
           if(maxSum == 0 && array.length >1){
            // if maxSum is zero and the array Length is greater than 1 then we can said that, there all are negative values.
            maxSum = array[0]; // we are assigning the 0th index value as, the curent value stored in maxSum is "0".
                               // If we compare any negative if "0", then 0 will stand as maxValue.  
            for(int i=0; i<array.length; i++){
                // will came every index value and will return the max value from here.
                if(maxSum < array[i]){
                    maxSum = array[i];
                }
              }
           }
           System.out.println("The max SubArray sum is : "+maxSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];
        // Take Input
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }

        maxSubarraySumByBruteForce(array);
        maxStbArraySumByPrefixSum(array);
        maxSubArraySumByKadanes(array);
    }
}
