import java.util.Scanner;

public class PairsInArray {
    
    public static void printPairs(int[] nums) {
        int n = nums.length;

        for (int i=0; i<=n-2; i++) {
            for(int j=i+1; j<n; j++){
                System.out.print("("+nums[i]+","+nums[j]+") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        // Take input
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }
        
        System.out.println("The pairs of given Array : ");
        printPairs(nums);
    }
}
