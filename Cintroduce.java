

import java.util.*;

public class Cintroduce {
  
  public static void main(String[] args){
    // int rollno = 64;
    // char letter = 'r';
    // float marks = 98.44f;
    // double lageDecimalNumber = 3454545.34543;
    // long lagerInteger = 7098090099890908089L;
    // boolen check = flase;
       Scanner sc = new Scanner(System.in);
    System.out.println("input your rollno");
    int rollno = sc.nextInt();
    System.out.println("your roll number is " + rollno);

    System.out.println("enter your marks");
    float marks = sc.nextFloat();
    System.out.println(marks);
   
    System.out.println("introduce yourself");
    String introduction = sc.nextLine();
   System.out.println(introduction);
     
 
  }
}
