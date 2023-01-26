
// import java.util.*;
// public class ZQuestion {

// public static void main(String[] args){
// // Scanner in = new Scanner(System.in);
// // System.out.println("Enter the number");
// // int n = in.nextInt();

// Scanner in = new Scanner(System.in);
// System.out.println("Enter the number");
// int n = in.nextInt();
//   boolean ans = IsPrime(n);
//   System.out.println(ans);

// }
// static boolean IsPrime(int n){

//   if(n<=1){
//     return false;
//   }
//   int c=2;
// while(c*c<=n){
//   if(n%c==0){
//     return false;
//   }
//   c++;
// }
// return c*c>n;

  
// }
// }
import java.util.*;
public class ZQuestion{

  public static void main(String[] args){

    Scanner in = new Scanner(System.in);
    System.out.println("Enter the Intger");
    int n = in.nextInt();
   boolean ans = isprime(n);
   System.out.println(ans);
  
  }
  static boolean isprime(int n){
    //  int n;
    if(n<=1){
      return false;
    }

    int c =2;
    while(c*c<=n){
      if(n%c==0){
        return false;
      }
      c++;
    }
    return c*c>n;
  }
}