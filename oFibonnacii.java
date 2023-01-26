
import java.util.*;
public class oFibonnacii {

  public static void main(String[] args){
     int a=0;
    int b =1;
   int  count = 2;
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
  while(count<=n) {

  int temp = b;
  b = b+a;
  a = temp;
  count++;
    
    }
    System.out.println(b);//3-2 4-3 5-5 6-8 7-13 8-21 ....fibonnacii series starts from 0th indes(0,1,2,3,4,5,6,7,8,9....)
  }
  
}
