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
          int min = data[i];
          for (int j = 0; j < data.length-1;j++) {
              if (min > data[j]) {
                min = data[j];
                data[j] = data[i];
                data[i] = min;
            }
          }
      }
  }

  public static void insertionSort(int[] data) {
      for (int i = 1; i < data.length; i++) {
          int front = data[i];
          int back = i-1;

          while (back >= 0 && data[back] > front) {
              data[back+1] = data[back];
              back--;
          }
          data[back+1] =data[i];

      }
  }




}
