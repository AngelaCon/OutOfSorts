import java.util.Random;
import java.util.Arrays;
public class Tester {

    public static void main(String[]args){
        int[] arr = new int[6];
        Random rng = new Random();
            for(int i =  0; i < 6; i++ ){
                arr[i]=(rng.nextInt() % 1000);
              System.out.println(rng.nextInt() % 1000);

            }
            System.out.println();

        System.out.println(Arrays.toString(arr));
        Sorts.bubbleSort(arr);

        System.out.println("After sorting:" + Arrays.toString(arr));
}



}
