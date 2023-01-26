
import java.util.*;
public class Wgreetin2 {
  public static void main(String[] args){
   Scanner in = new Scanner(System.in);
   System.out.println("Enter your name");
   String naam = in.next();
   String personlaized = myGreet(naam);
   System.out.println(personlaized);
  // System.out.println(myGreet("Bandana jha"));
    
  }

  static String myGreet(String name)
{
 String message = "Hello " + name;
 return message;
}

}
