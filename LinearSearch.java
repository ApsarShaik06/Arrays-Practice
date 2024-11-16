import java.util.*;
public class ArraysCC {

    public static int linerSearch(int numbers[], int key) {

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];

        // Taking input of numbers from user
        for (int i=0; i<numbers.length; i++) { // instead of numbers.length, we can use "n" here.
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter a key element which you want to find : ");
        int key = sc.nextInt();

        int index = linerSearch(numbers, key);
        if(index == -1){
            System.out.println("Given key doen't not exist. ");
        } else{  
            System.out.println("Given is found at index : "+index);
        }
    }
}
