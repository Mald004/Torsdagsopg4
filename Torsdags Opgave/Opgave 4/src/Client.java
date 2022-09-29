import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    static ArrayList<String>actions = new ArrayList<>();

    public static void main(String[] args) {

      actions.add("Start game");
      actions.add("Resume game");
      actions.add("Pause game");
      actions.add("Stop game");


      Menu menu = new Menu(actions);

      String showResult = menu.showMenu();
      System.out.println(showResult);







    }

    public static void doAction(int action){
        switch(action){
            case 1:
                System.out.println("Starting the game now");
            case 2:
                System.out.println("Fetching previously saved game data");
            case 3:
                System.out.println("Game paused");
            case 4:
                System.out.println("Ending game");
        }
    }

}
