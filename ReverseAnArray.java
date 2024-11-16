import java.util.*;
public class ReverseAnArray {
    
    public static void reverse(int[] nums, int n) {
        int start =0;
        int end = n-1;

        while(start < end) {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       
       int[] nums = new int[n];
       // take input
       for (int i=0; i<n; i++) {
          nums[i] = sc.nextInt();
       }

       reverse(nums, n);
       //print the reversed array.
       System.out.println("The reversed array is : ");
       for (int i=0; i<n; i++) {
           System.out.print(nums[i]+" ");
       }
       System.out.println();
    }
}
