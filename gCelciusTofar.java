import java.util.*;

public class gCelciusTofar {
  
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the temperature of celcius");
    int tempC= sc.nextInt();
    float tempF = (tempC *9/5)+32;
    System.out.println(tempF);
  }
}
