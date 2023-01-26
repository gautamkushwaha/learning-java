import java.util.*;

public class Iloops {
  public static void main(String[] args){

    //syntax of for loop:
    // for(initialization; condition;increament){
    //  
    //  -body
    // }

    // Q: print numbers from 1 to 5
    for (int i = 0; i < 50; i++) {
      System.out.println(i);  //0....50
      System.out.println("Best wishes for Architecture Day! create wonders in the world "+ i);// Best wishes for Architecture Day! create wonders in the world (0-50 times)with 0-50
      
    //]
  //  }

//   print numbers from 1 to n
  Scanner sc= new Scanner(System.in);
  int num= sc.nextInt();
  for (int j = 0; j < num; j++) {

System.out.println(j); // give number 6 out: 0 1 2 3 4 5
  }




//while loop

//  syntax:
//   intializatin;
//     while(condition){
//         -body
//       increament;
//    }




int n=8;
while(n<=80){
  System.out.println(n);
  n+=8;     //can print table of any number giving the initial of the number which table is required, highest of it s 10 multiple and increasing by the same number  out; 8 16 ......80
}



// do while loop
// do{
//   -body
// }while(condition);



int n1 =1;
do{
  System.out.println("Radha and krishna are the inspiration for all the lovers");
  n1+=1;
}while(n1!=6);//this is the most interesting feature i have used for do while loop: intial ,increase and condition; a lot of times the condiiton is not met and the loop will iterate for infinite times;

  }
}
}
