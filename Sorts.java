public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
      for (int i = 0; i < data.length-1; i++) {
          for (int j = 0; j < data.length-1-i; j++){
              if (data[j] > data[j+1]) {
                 int temp = data[j];
                 data[j]=data[j+1];
                 data[j+1]=temp;
              }
          }

      }
  }

  public static void selectionSort(int[] data){
      for (int i = 0; i < data.length-1; i++) {
          int currentMinimum = data[i];
          int currentMinimumIndex = i;
          for (int j = i+1; j < data.length;j++) {
              if (currentMinimum > data[j]) {
                currentMinimum = data[j];
                currentMinimumIndex = j;
            }
          }
          data[currentMinimumIndex] = data[i];
          data[i] = currentMinimum;
      }
  }

  public static void insertionSort(int[] data) {
      for (int i = 1; i < data.length; i++) {
          int currentValue = data[i];
          int backIndex = i-1;

          while (backIndex >= 0 && data[backIndex] > currentValue) {
              data[backIndex+1] = data[backIndex];
              backIndex--;
          }
          data[back+1] = data[i];
      }
  }



}
