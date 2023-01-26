 
 import java.util.Scanner;
 public class Dsum {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    float num1 = input.nextFloat();
    float num2 = input.nextFloat();
    float sum = num1+num2;
    float diff = num1-num2;
    float mul = num1*num2;
    float div = num1/num2;
    System.out.println("sum:"+sum+" diff:"+diff+" mul:"+mul+" div:"+div);
  }
}
