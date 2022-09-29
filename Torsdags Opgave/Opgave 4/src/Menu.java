import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
   private ArrayList<String>options = new ArrayList<>();

   public Menu(ArrayList<String>options){
   this.options = options;

   }

   public String showMenu(){
       Scanner scan = new Scanner(System.in);
        System.out.println("Type a number to choose: ");
       int choice = scan.nextInt();


       return options.get(choice);
   }


}
