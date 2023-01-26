
import java.util.*;
import java.math.*;
public class mLargest {

  public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the numbers you want to compare:");
int a =  sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();



// int max= a;
// if(b>max){
//   max =b;
// }
// if(c>max){
//   max =c;
// }
// System.out.println(max);//Entet the numbers you want to compare: 45 34 56 out: 56
  


// int max = 0;
// if(a>b){
//   max = a;
// }
// else{
//   max =b;
// }
// if(c>max){
//   max=c;
// }
// System.out.println(max); //Enter the numbers you want to compare: 45 34 56 out: 56



int max =0;
max =Math.max(Math.max(a,b),c);
System.out.println(max);
  }
  
}
