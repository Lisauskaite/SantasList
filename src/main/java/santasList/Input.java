package santasList;

import java.util.Scanner;

public class Input {

    static Scanner scanner = new Scanner(System.in);
    public void printMenu () {
        System.out.println("******************************************************************************************");
        System.out.println("*   PRESS [1] To get the list of children that are assigned a gift                       *");
        System.out.println("*   PRESS [2] Add a new child to the list                                                *");
        System.out.println("*   PRESS [3] Add a new gift to the list                                                 *");
        System.out.println("*   PRESS [4] To see the list of children and gifts that are unassigned                  *");
        System.out.println("*   PRESS [5] To randomly assign a gift to all the children that don't have gifts yet    *");
        System.out.println("*   PRESS [6] to assign a specific gift to a specific child                              *");
        System.out.println("******************************************************************************************");
        System.out.println("");
    }

    public void printMenuAgain () {
        System.out.println("");
        System.out.println("                 ****************************************************");
        System.out.println("                     Please choose what else would you like to do");
        System.out.println("");
        shorterMenu();
    }
    public static String enterName() {
        System.out.println("Please enter a new name you would like to add to the list");
        return scanner.nextLine();
    }
    public static String enterGift() {
        System.out.println("Please enter a new gift you would like to add to the list");
        return scanner.nextLine();
    }
    public static String enterGiftFromList() {
        System.out.println("Please enter a new gift from the list above");
        return scanner.nextLine();
    }
    public static String enterNameFromList() {
        System.out.println("Please enter a name from the list above");
        return scanner.nextLine();
    }

    public void shorterMenu (){
        System.out.println("                ----------------------   --------------   -------------");
        System.out.println("                 [1]Assigned children     [2]New child     [3]New Gift");
        System.out.println("                ----------------------   --------------   -------------");
        System.out.println("     --------------------------------   ------------------   -------------------------");
        System.out.println("      [4]Unassigned children & gifts     [5]Random assign     [6]Assign gift to child");
        System.out.println("     --------------------------------   ------------------   -------------------------");

    }
    public void helloSign (){
        System.out.println("       ");
        System.out.println("                 ----------------------------------------------------------- ");
        System.out.println("                  HI THERE! CHOOSE ONE OF THE OPTIONS IN THE MENU PLEASE :) ");
        System.out.println("                 ----------------------------------------------------------- ");
        System.out.println(" ");
        System.out.println("");
    }

    public void listSign(){
        System.out.println("Here is a list :)");
        System.out.println("");
        System.out.println("**********************************");
    }
}
