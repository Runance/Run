package runquad;
import java.util.Scanner;
public class RunQuad {

   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);  
      
      System.out.println("Press R For Rectangle or S for Square");
      String input = scn.next();
      
      if(input.equalsIgnoreCase("R")){
          Rectangle R = new Rectangle();
          R.showDescription();
      }else if(input.equalsIgnoreCase("S")){
          Square Sq = new Square();
          Sq.showDescription();
      }else{
          System.out.print("invalid closing");
      }
      
      
    }
    
}
