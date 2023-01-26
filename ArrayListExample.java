 
 import java.util.*;
 public class ArrayListExample {

  public static void main(String[] args){

    //syntax

    ArrayList<Integer> list = new ArrayList<>(10);

    // list.add(56);
    // list.add(34);
    // list.add(56);
    // list.add(78);
    // list.add(56);
    // list.add(34);
    // list.add(56);
    // list.add(78);
    // list.add(56);
    // list.add(34);
    // list.add(56);
    // list.add(78);
    // list.add(56);
    // list.add(34);
    // list.add(56);
    // list.add(78);
    // list.add(56);
    // list.add(34);
    // list.add(56);
    // list.add(78);
    // list.add(56);
    // list.add(34);
    // list.add(56);
    // list.add(78);
    
    // System.out.println(list.contains(34));// true if the number is present in the list


    // list.set(0, 99);

    // list.remove(4);

    // System.out.println(list);

    // //input

 
    Scanner in = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      list.add(in.nextInt());
    }
    

    //get item at any index
    for (int i = 0; i < 5; i++) {
      System.out.println(list.get(i)); //the syntax to get list is this, list[index won't work here]
      }

      System.out.println(list);
      
    
}
 }
