import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
  

  /**
   * @param args
   */
  public static void main(String[] args){


//array of primitive
    // int[] arr = new int[44];
    // arr[0]=23;
    // arr[1]=24;
    // arr[2]=25;
    // arr[3]=28;
    // arr[4]=24;
    // arr[5]=11;
    // arr[6]=17;
    // arr[7]=45;
    // arr[8]=55;
    // arr[9]=21;

    // System.out.println(arr[4]);

    //input using for loops
    // for (int i = 0; i < 10; i++) {

    //   System.out.println(arr[i]);
      
    //}
  // System.out.println(Arrays.toString(arr));
    //print the element of an array
    // for (int i = 0; i < 10; i++) {
    //   System.out.println(arr[i]);
    // }
  

    // for(int num : arr){    //for every element of array, print the element
    //   System.out.println(num);//  here num represents the element of the array
    // }
   // System.out.println(arr[50]);//array out of bound


   //array of objects
    Scanner in = new Scanner(System.in);
   String[] str = new String[4];
   for(int i = 0; i<str.length;i++){
    str[i]= in.next();
   }
   System.out.println(Arrays.toString(str));
 


  //two dimensional arrays

  // modify 
  str[1] ="gautam";
  
   System.out.println(Arrays.toString(str));//wil take the imput and print it and will again modify that 
}
}   