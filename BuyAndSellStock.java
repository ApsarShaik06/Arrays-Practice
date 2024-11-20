import java.util.*;

public class BuySellStock {
    
    public static int profitOfStock(int[] arr, int n){
        // TC -> O(n)
        // SC -> O(n)
        int profit =0;

        // rightmax array
        int[] rightMax = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int i= n-2; i>=0; i--){
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }
        
        // caluate profit
        for(int i=0; i<n; i++){
            profit = Math.max(profit, rightMax[i]-arr[i]);
        }
        return profit;
    }

    public static int profitStock(int[] arr, int n){
         // TC -> O(n)
        // SC -> Constant
        int maxProfit =0;
        int buyPrice = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            int sellingPrice = arr[i];
            if(buyPrice < sellingPrice){ // selling is greater than buying price, then will calculate profit
                int currProfit = sellingPrice - buyPrice;
                maxProfit = Math.max(maxProfit, currProfit);
            } else { // selling is less than buying price,
                buyPrice = sellingPrice;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] CostOfStock = new int[n];

        for(int i=0; i<n; i++){
            CostOfStock[i] = sc.nextInt();
        }
        int profit = profitOfStock(CostOfStock, n);
        System.out.println("The profit is : "+profit);
        int pr = profitStock(CostOfStock, n);
        System.out.println("The profit is : "+pr);
    }
}
