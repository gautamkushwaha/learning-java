import java.util.Scanner;

public class pCount {

  public static void main(String[] args){

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number ");
  long n = sc.nextLong();
  int count=0;
  System.out.println("Enter the digit you want to count");
  int d =sc.nextInt();
  while(n!=0){
    long rem =  n % 10;
    if(rem==d){
      count++;
    }
    n = n/10;
  }
  System.out.println(count);/// enter the string:0039793384054570 input the digit you want to count:0 out:2(the initial two zero are not essential )

  }
  
}
