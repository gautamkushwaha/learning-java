import java.util.Arrays;

public class ZVarArgs {
  
  public static void main(String[] args){
   // fun();
    multiple(2,3,"kunal","rahul","dvvtshusc");    //2 3 kunal.......
    demo(2,3,4);  //output:2,3,4
    demo("Ramesh","Rahul","Harati","Tejaswini","Bandana","vaijaynti");//[Ramesh, Rahul, Harati.....]

  }

  static void demo(int ...v){
    System.out.println(Arrays.toString(v));
  }
  static void demo(String ...v){
    System.out.println(Arrays.toString(v));
  }
  static void multiple(int a, int b, String name, String nee, String ni){
    System.out.println(a+" "+ b +" " + name + " "+nee+" " + ni +" ");
  }
}
