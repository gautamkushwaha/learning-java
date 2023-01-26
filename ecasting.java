import java.util.Scanner;

import java.util.Scanner;
public class ecasting {

  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  // float num = sc.nextFloat();
//    int num1 = sc.nextInt();
//   // System.out.println(num );// 34 34.0
//   System.out.println(num1); //45 45  //45.0  check

//   //automatic type promotion in expression
//   int a =267;
//   byte b = (byte)a;//267%256=11
// System.out.println(b);  //11

// byte a = 43;
// byte b = 34;
// byte c = 33;
// int d = (a*b)/c; /*the result of a *b is exceeding the byte but how it is doing this, it is like giving automaticatically convert  to int and then calculating*/
// System.out.println(d); //44
 
// byte b = 50;
// b = b * 2;//showing error and suggesting to change b to int

// int number = 'A';
// System.out.println(number);//  65  (ascii value of A is 64)

// System.out.println(7.8*77);  //  600.6  /*every small value is converted to big value if operated with the big value as show above(byte-short-int-float-doble-long)*/

byte b = 42;
char c = 'a';
short s = 1024;
int i = 50000;
float f = 5333.5f;
double d = 0.333334;
double result = (f*b)*(i/c)-(d-s);///1.15433434
System.out.println(result);
System.out.println((f*b) + " "+(i/c)+" "+(d+c));//224  -.515 97.33334


}
}