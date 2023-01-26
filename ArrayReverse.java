import java.util.Arrays;

public class ArrayReverse {
  public static void main(String[] args){

    int[] arr = {2,3,4,5,6};
    reverse(arr, 0, arr.length-1);

    System.out.println(Arrays.toString(arr));
}

static void reverse(int[] arr,int start, int end){

while(start<end){
  swap(arr, start, end);
  start++;
  end--;
}
}
static void swap(int[] arr, int start, int end){
  int temp = arr[start];
  arr[start]= arr[end];
  arr[end]= temp;

}
}

/*
 [6,5,4,3,2]
 */