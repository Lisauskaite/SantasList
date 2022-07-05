package santasList;

import java.util.Collections;
import java.util.Scanner;

public class Input {

    Scanner scanner = new Scanner(System.in);
    public void printMenu () {
        System.out.println("PRESS [1] To get the list of children that are assigned a gift");
        System.out.println("PRESS [2] Get the number of children that are assigned a gift");
        System.out.println("PRESS [3] Get the number of children that don't have a gift");
        System.out.println("PRESS [4] Get the number of gifts still unassigned");
        System.out.println("PRESS [5] Add a new child to the list");
        System.out.println("PRESS [6] Add a new gift to the list");
        int menuScanner = scanner.nextInt();
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
