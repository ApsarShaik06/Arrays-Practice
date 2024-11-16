import java.util.Scanner;

public class BinarySearch {
    static Scanner sc;

    public static void takeInput(int[] nums, int n) { // function to take input from user
        for(int i =0; i<n; i++) {
            System.out.println("Enter the values at "+i+"th position : ");
            nums[i] = sc.nextInt();
        }
    }

    public static void showValues(int[] nums, int n) { // function foe displaying the array values.
        for (int i=0; i<n; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

    public static int binarySearch(int[] nums, int key) {
        int start = 0; 
        int end = nums.length-1;

        while(start <= end){
            int mid = (start+end)/2;

            if(nums[mid] == key) {
                return mid;
            } else if(nums[mid] < key) {
                start = mid+1;
            } else if(nums[mid] > key) {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        takeInput(nums, n);
        System.out.println("The values are : ");
        showValues(nums, n);

        // Binary search
        System.out.println("Enter which key you want search : ");
        int key = sc.nextInt();
        int index = binarySearch(nums, key);

        if(index == -1){
            System.out.println("Given key is not existing here.");
        } else {
            System.out.println("Given key "+key+" is found at index : "+index);
        }
    }
}
