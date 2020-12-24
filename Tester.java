import java.util.*;
public class Tester{
    public static void main(String[] args) {
        // AMOUNT OF TESTS TO RUN. CHANGE IF YOU THINK YOUR COMPUTER CAN HANDLE IT
        //
        int testAmt = 100;
        String finalMessage = "found failed cases";
        System.out.println("Testing Insertion");
        int[] arr1 = new int[4];
        arr1[0] = 3;
        arr1[1] = 5;
        arr1[2] = 2;
        arr1[3] = 1;
        Sorts.insertionSort(arr1);
        System.out.println(Arrays.toString(arr1));
        for(int i = 0; i < testAmt; i++){
            Random seed = new Random(); // set the seed for element so we can trace it back if neceessary
            Random arrSize = new Random();
            int seedVal = seed.nextInt() % 1000;
            Random element = new Random(seedVal);

            int[] arr = new int[arrSize.nextInt(50)]; //set the size bound for the testing array
            for(int j = 0; j < arr.length; j++){
              arr[j] = element.nextInt() % 1000; // set the element bound for the testing array
            }
            int[] clone = arr.clone(); // clone the current arr
            Sorts.insertionSort(arr);
            Arrays.sort(clone);
            //System.out.println(Arrays.toString(arr));
            //System.out.println(Arrays.toString(clone));
            if (!Arrays.equals(arr,clone)) {
                throw new Error ("failure at random test " +  i + " . \n Expected: " + Arrays.toString(clone) + " \n Received: " + Arrays.toString(arr));
            }
            //REVERSE THE ARRAYS AND CHECK IF SORT STILL WORKS
            reverse(clone);
            reverse(arr);
            Sorts.insertionSort(arr);
            Arrays.sort(clone);
            if (!Arrays.equals(arr,clone)) {
                throw new Error ("failure at reverse test " +  i + " . \n Expected: " + Arrays.toString(clone) + " \n Received: " + Arrays.toString(arr));
            }
            finalMessage = "------random tests passed------";
        }
        System.out.println(finalMessage);


        // Sorts.selectionSort(arr);
        // System.out.println(arr);
        //
    }
    public static void reverse(int[] arr){
        for(int i = 0; i < arr.length / 2; i++){
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
        }
    }



}
