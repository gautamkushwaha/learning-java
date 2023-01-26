

import java.util.*;

public class Tnested {
  /**
   * @param args
   */
  public static void main(String[] args){
 
    Scanner in = new Scanner(System.in);
    System.out.println("enter roll no");
    int roll = in.nextInt();
  
    switch(roll){
      case 1->System.out.println("Gautam Kushwaha");
      case 2 ->System.out.println("V J");
    case 3 -> {
      System.out.println("enter your department");
        String department = in.next();
       switch(department){
        case "cse" ->System.out.println("Gautam Kushwaha");
        case "architecture"->System.out.println("V J");
        case "civil" -> System.out.println(" Saloni");
        case "mechanical" -> System.out.println("Sathira parere");
        case "it"->{ System.out.println("Enter interest");
              String interest = in.next();
              switch(interest){
            case "bts"->System.out.println("You are BTS fan!");
            case "marvel"->System.out.println("Your are marvel man");
            case "football"->System.out.println("football player");
            case "cricket" ->System.out.println("cricket player");
            case "badminton"->System.out.println("bad minton player");
            default -> System.out.println("you are child"); 
          } 
          }
          default ->System.out.println("You are not a engineering fellow");
      }
    }
    default ->System.out.println("give the roll(1-3)");
    }

  }
  
}
/*
enter roll no
(i)3
(o)enter your department
(i)it
(o)enter your interest
(i)t
(o)you are child
 */
