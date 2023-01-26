public class zOverloading{


public static void main(String[] args) {

 // fun(67);
  //fun("kunal kushwaha");
int ans = sum(3,4);//if you supply  more argumensts it will show errors
System.out.println(ans);
  
}

static int sum(int a,int b){
  return a +b;
}

static void fun(int a){
  System.out.println("first one");
  System.out.println(a);
}
static void fun(String name){
  System.out.println("second one");
  System.out.println(name);
}
}