import java.util.*;
public class nCaseCheck {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().trim().charAt(0);
    if(ch>='a' && ch<='z'){
      System.out.println("Lowercase");  //h Lowercase
    }
    else{
      System.out.println("Uppercase");//H Uppercase
    }
  }
}