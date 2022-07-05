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
        System.out.println("******************************************************************************************");
        System.out.println("");
    }

    public void printMenuAgain () {
        System.out.println("");
        System.out.println("      ****************************************************");
        System.out.println("          Please choose what else would you like to do");
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

    public void shorterMenu (){
        System.out.println("    ----------------------   --------------   -------------");
        System.out.println("     [1]Assigned children     [2]New child     [3]New Gift");
        System.out.println("    ----------------------   --------------   -------------");
        System.out.println("     --------------------------------   ------------------");
        System.out.println("      [4]Unassigned children & gifts     [5]Random assign");
        System.out.println("     --------------------------------   ------------------");

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

//            public static void randomChildrenList (){
//        String result;
//            int randomIndex = (int) (Math.random() * children.size());
//            result = children.get(randomIndex);
//            System.out.println(result);
//        }
//    public static void ifPressed1 () {
//        do {
//            System.out.println("You have chosen to see all the children that have been assigned a gift!");
//            System.out.println("Here it is!");
//            for (String s : newListOfChildren) {
//                System.out.println(s);
//                System.out.println("If you would like to go back to the menu PRESS [0]");
//
//        }
//    }
//public String generateChildrenList() {
//    String allChildren = "";
//    for (String newChild : newListOfChildren) {
//        if (newListOfChildren.indexOf(newChild) != 0) {
//            allChildren += ", " + newChild;
//        }
//        else {
//            allChildren += newChild;
//        }
//    }
//    return allChildren;
//}
//    public void addParticipant(String name) { newListOfChildren.add(name); }
}
