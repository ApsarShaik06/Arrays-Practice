import java.util.Scanner;

public class TrappedRainWater {
    
    public static int RainWaterTrapped(int[] arr, int n){
        
        int wt =0; // wt --> waterTrapped
        if(n <= 2){
            return wt; 
        }
        // left max boundary creating
        int[] leftMax = new int[n];
        leftMax[0] = arr[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }

        // Right max boundary creating
        int[] rightMax = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], arr[i]);
        }

        // Calculating water trapped
        int waterLevel = 0;
        int calwt =0;
        for(int i=0; i<n; i++){
            waterLevel = Math.min(leftMax[i], rightMax[i]); // taking minimum of both boundaries
            calwt = waterLevel - arr[i];
            if(calwt < 0){ // negatie water trapped won't br possible, so we will make it as 0
                calwt =0; 
            }
            wt +=calwt;
        }
        return wt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int wt = RainWaterTrapped(arr, n);
        System.out.println("The Trapped Rain water is : "+wt);
    }
}
