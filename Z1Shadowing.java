public class Z1Shadowing{
  static int x=90;   //this will be shadowed in line 6
  public static void main(String[] args){
    System.out.println(x); //90
   // int x =40;            //the class variable at line 4 is shadowed by this

    int x;
   //System.out.println(x);  //scope will begin when value is initialized
   
   x =40;
    System.out.println(x); //40
    fun();
  }
  static void fun(){
    System.out.println(x);
  }
}