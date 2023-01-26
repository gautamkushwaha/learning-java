import java.util.*;

public class Z3Armstron {
  



  /*  the cube of each digit of the number is the number itself for three digit number 
   e. g. a = 153  then 
   1^3 + 5^3 + 3^3 = 153 
   i.e. a is an Armstrong number */

   public static void main(String[] args){
    Scanner in = new Scanner(System.in);
  //   System.out.println("Enter the Intger");
  //   int n = in.nextInt();
  //  boolean ans = isArmstrong(n);
  //  System.out.println(ans);

  for(int i =100;i<=999;i++){
    if(isArmstrong(i)){
      System.out.println(i);
    }
  }

   }
   static boolean isArmstrong(int n){
    int  a =n;
    int sum = 0;
    while(n>0){
     int rem=n%10; 
       
      sum = sum+ rem*rem*rem;
      n=n/10;
      }
     
    // if(a==sum){
    //   return true;

    // }
    // else{
    //   return false;
    return a==sum;
    }
   }

  /*
    output:
    153 370 371 407
     we don't need to take input here as we are printing the armstrong number between 100 and 999 , in the same way by using 
     for loop, while loop or any other loop we can print all the required armstrong number. By using the concept we can print other numbers as well.
   
   */
