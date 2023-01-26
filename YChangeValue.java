import java.util.Arrays;

public class YChangeValue {

  public static void main(String[] args){
  //create an array
  int[] arr = { 1,2,3,4,5};
  change(arr);
  System.out.println(Arrays.toString(arr));

  }
  static void change(int[] nums){
    nums[0]=99;
    nums[2]=33;//99,2,33,4,5 //in java the function is passed by valus, not by reference
  }
  
}
