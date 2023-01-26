
import java.util.*;
public class ArrayMul {
  public static void main(String[] args){

    /*
     1 2 3
     4 5 6
     7 8 9
     */

    // int[][] arr = new int[3][3];

//      int[][] arr= {
//           {1,2,3},
//           {4,5,6},
//           {7,8,9} 
//    };
// }   int[][] arr2= {
//           {1,2,3},//oth index
//           {4,6},  //1st index
//           {7,8,9}    //2nd index //does not matter the number of rows and column



Scanner in = new Scanner(System.in);
int[][] arr = new int[3][3];
System.out.println(arr.length);

//input for rows and columns

for(int row = 0; row<arr.length;row++){

  //for each col in every row
  for (int col = 0; col < arr[row].length; col++) {
     arr[row][col]= in.nextInt();
    
  }
}


// one way to print 
//for(int row = 0; row<arr.length;row++){

  // //for each col in every row
  // for (int col = 0; col < arr[row].length; col++) {
  //        System.out.print(arr[row][col]  + " ");
  //  }
  //  System.out.println();
  //    }


// // Array to string method 
// for(int row = 0; row<arr.length;row++){
//   System.out.println(Arrays.toString(arr[row]));
 //  }

 //enhanced way to print two dimensional arrays

 for(int[]a : arr){

  System.out.println(Arrays.toString(a));

 }
  }
}