import java.util.Arrays;

public class ArraySwap {
  public static void main(String[] args){

    int[] arr = {2,3,4,5,6};
    swap(arr, 3, 4);

    System.out.println(Arrays.toString(arr));
}

static void swap(int[] arr, int a, int b){

  int temp = arr[a];
  arr[a]= arr[b];
  arr[b]= temp;
}
}
/*
output
[2,3,4,6,]
*/
