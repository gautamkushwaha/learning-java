

public class Array1 {
  

  public static void main(String[] args){
  int[] ros; // declaration of array. ros is getting defined in stack
  
  ros = new int[5];//initialization acutally here object is being created in the memory (heap)

  System.out.println(1);

  String[] arr = new String[4];
  System.out.println(arr[0]); 
  String num = null;
   // int num = null;   // int num shows error, but if we assign String num = null, it does not show error in any way
  System.out.println(num);
  
}
}