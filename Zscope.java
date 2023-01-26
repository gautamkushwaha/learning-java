public class Zscope {
  
  public static void main(String[] args){
    int a= 10;
    int b = 20;
    random(b);
    String name= "Kunal";

  {

    //int a =78; ////you can't reinitialize the same variable but you can change the value
    
    a =78;     //outside variable can be used and changed here 
   System.out.println(a);
   
   int c=99; //values initialized in the block will remain in this block only
   
   name ="Rahul";
   System.out.println(name);

   //scooping in for loops
   for(int i= 0;i<4;i++)
   {
    System.out.println(i);
    int num = 90;
     a = 1000;         //changing the original value, not reinitializing the varible is allowed inside the block
   }
   System.out.println(a);

  }

  int c =990;    //anything inside the block is not know outside the block so, we can reiniatialize it outside as well
  System.out.println(a);
  System.out.println(name);
   }
  static void random(int marks){
    int num = 67;
    System.out.println(num);
    System.out.println(marks);//67 20
  }
}
