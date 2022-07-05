package santasList;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> children = new ArrayList<>();
        children.add("Dianne Ameter");
        children.add("Bodrum Salvador");
        children.add("Hilary Ouse");
        children.add("Indigo Violet");
        children.add("Hans Down");
        children.add("Shequondolisa Bivouac");
        children.add("Ingredia Nutrisha");
        children.add("Fig Nelson");
        children.add("Benjamin Evalent");
        children.add("Gustav Purpleson");
        children.add("Elon Gated");
        children.add("Gootsy Porkins");
        children.add("Cornbread Stevens");
        children.add("Slaps Guster");
        Collections.shuffle(children);


        List<String> gifts = new ArrayList<>();
            gifts.add("Compass");
            gifts.add("Banana");
            gifts.add("Joystick");
            gifts.add("Tamagotchi");
            gifts.add("Drone");
            gifts.add("Basketball ball");
            gifts.add("Pear Watch");
            gifts.add("Glasses");
            gifts.add("Scooter");
            gifts.add("Digimon");
            gifts.add("Lego kit");
            gifts.add("Visma internship");
            gifts.add("Football ball");
            gifts.add("Karaoke set");

        Random random = new Random();
        List<String> newListOfChildren = new ArrayList<>();
        List<String> newListOfGifts = new ArrayList<>();

        System.out.println("       ");
        System.out.println("      HI THERE! CHOOSE ONE OF THE OPTIONS IN THE MENU PLEASE :) ");
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
        Input menu = new Input();
        menu.printMenu();
        int menuNumber = scanner.nextInt();
            if (menuNumber == 0) {
                menu.printMenu();
            }
            if (menuNumber == 1){
                System.out.println("You have chosen to see all the children that have been assigned a gift!");
                if (newListOfChildren.size() == 0) {
                    System.out.println("I'm so sorry no children have been assigned a gift yet");
                    System.out.println("Please choose what else would you like to do");
                    menu.printMenu();
                    menuNumber = scanner.nextInt();
                    }
                } else
                    for (String s : newListOfChildren) {
                        System.out.println("Here it is!");
                        System.out.println(s);
                        System.out.println("If you would like to go back to the menu PRESS [0]");
                    }
             if (menuNumber == 2){
                 int numberOfChildrenThatHaveAGift = newListOfChildren.size();
                 System.out.println("The number of children that still don't have a gift is " + numberOfChildrenThatHaveAGift);
             }

             if (menuNumber == 3){
                 int numberOfChildfrenThatDontHaveAGift = children.size();
                 System.out.println("The number of children that still don't have a gift is " + numberOfChildfrenThatDontHaveAGift);
             }

             if (menuNumber == 4){
                 int numbeOfGifts = gifts.size();
                 int numberOfAssignedGifts = newListOfGifts.size();
                 int numberOfGiftsStillunassigned = numbeOfGifts - numberOfAssignedGifts;
                 System.out.println("the number of gifts still unassigned is " + numberOfGiftsStillunassigned);

             }
             if (menuNumber == 5){
                 String name = scanner.next();
                 System.out.println("Please write a childs name that you would like to add to the list");
                 children.add(name);
                 System.out.println("Thank you " + name + "has been added to the list");
             }
             if (menuNumber == 6){
                 String gift = scanner.next();
                 System.out.println("Please write a gift that you would like to add to the list");
                 gifts.add(gift);
                 System.out.println("Thank you " + gift + "has been added to the list");
             }
        }
    }
