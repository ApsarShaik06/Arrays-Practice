public class Sort {
    
    public static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j= 0; j<arr.length-1-i; j++){
                
                if(arr[j] > arr[j+1]){
                   //swap
                   int temp = arr[j+1];
                   arr[j+1] = arr[j];
                   arr[j] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }


    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int currEle = arr[i];
            int prev = i-1;
            // finding position to insert.
            while(prev >= 0 && arr[prev] > currEle){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insert
            arr[prev+1] = currEle;
        }
    }

    public static void countingSort(int[] arr){
        // will create a array with maxElement as it's size
        // in his countArray will store the frequency of element at their index

        // find max element in given array.
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
             max = Math.max(max, arr[i]);
        }

        int[] freqArray = new int[max+1];
        // will go each index in given array, and will add 
        //+1 at same index(here index, will take it as the current value of given array) of freqArray.

        for(int i=0; i<arr.length; i++){
            // int curr = arr[i];
            // freqArray[curr] +=1;
            freqArray[arr[i]]++;
        }

        // sorting
        int j=0;
        for(int i=0; i<freqArray.length; i++){
            while(freqArray[i] >0){
                arr[j] =i;
                j++;
                freqArray[i]--; 
            }
        }
    }
    public static void printArray(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3,4,1,3,1};

        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        countingSort(arr);
        printArray(arr);
    }
}
