
import java.util.*;

public class factorial1 {

  public static void main(String[] args0) {
  Scanner in = new Scanner(System.in);
int a = in.nextInt();


long ans = fact(a);
System.out.println(ans);
  }

  static long fact(int n){
    if(n<=1){
      return 1;
    }
    else{
      return n*fact(n-1);
    }
  }
  
}
