
import java.util.*;
public class rCalculator {

  /**
   * @param args
   */
  public static void main(String[] args){
    
    Scanner in = new Scanner(System.in);
    int ans=0; //take input from user untill the user does not press X or x
  while(true){
    System.out.println("Enter the operator:");
     char op = in.next().trim().charAt(0);
     if(op =='+' || op =='-' || op =='*' || op =='/'){
      //input two numbers
      System.out.println("Enter two numbers:");
      int num1=in.nextInt();
      int num2=in.nextInt();

      if(op == '+'){
        ans = num1 + num2;
         }
      if(op == '-'){
        ans = num1-num2;
         }
     if(op == '*'){
        ans = num1*num2;
          }
     if(op == '/'){
          if(num2!=0){
        ans = num1/num2;
        }
       }
     if(op == '%'){
        ans = num1%num2;
         }
          System.out.println("the output of the given operation is  " + ans);
     }    
     else if(op == 'x' || op =='X')
           {
            break;
          }
       else {
        System.out.println("invalid operation:!");
          } 

      
     }

 }
}
    

