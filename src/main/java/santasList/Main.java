package santasList;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

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

        List<String> newListOfChildren = new ArrayList<>();
        List<String> newListOfRandomChildren = new ArrayList<>();
        List<String> newListOfRandomGifts = new ArrayList<>();
        List<String> newListWithAllNames = new ArrayList<>(children);

        int randomNum = ThreadLocalRandom.current().nextInt(1, children.size() + 1);
        String newPair;
        Collections.shuffle(children);
        for (int i = 0; i < randomNum; i++) {
            Collections.shuffle(gifts);
            String randomChild = children.get(i);
            String randomGift = gifts.get(i);
            newPair = randomChild + " is going to get a " + randomGift;
            newListOfChildren.add(newPair);
            newListOfRandomChildren.add(randomChild);
            newListOfRandomGifts.add(randomGift);
        }
        children.removeAll(newListOfRandomChildren);
        gifts.removeAll(newListOfRandomGifts);
        newListWithAllNames.addAll(newListOfRandomChildren);

        Scanner scanner = new Scanner(System.in);
        Input menu = new Input();
        menu.helloSign();
        menu.printMenu();
        Input menuAgain = new Input();

        int menuNumber;
        do {
            menuNumber = scanner.nextInt();
            switch (menuNumber) {
                case 1:
                    System.out.println("You have chosen to see all the children that have been assigned a gift!");
                    if (newListOfChildren.size() == 0) {
                        System.out.println("I'm so sorry but no children have been assigned a gift yet");
                        menuAgain.printMenuAgain();
                    } else {
                        int numberOfChildrenThatHaveAGift = newListOfChildren.size();
                        System.out.println("The number of children that are already assigned a gift is => " + numberOfChildrenThatHaveAGift + "!");
                        menu.listSign();
                        newListOfChildren.forEach(System.out::println);
                        menuAgain.printMenuAgain();
                    }
                    break;
                case 2:
                    String name = Input.enterName();
                    if (newListWithAllNames.contains(name)) {
                        System.out.println("I'm sorry this name is already on the list, please PRESS [2] and try again :)");
                    } else {
                        children.add(name);
                        newListWithAllNames.add(name);
                        System.out.println("Thank you " + name + " has been added to the list");
                        menuAgain.printMenuAgain();
                    }
                    break;
                case 3:
                    String gift = Input.enterGift();
                    gifts.add(gift);
                    System.out.println("Thank you " + gift + " has been added to the list");
                    menuAgain.printMenuAgain();
                    break;
                case 4:
                    if (children.size() == 0) {
                        System.out.println("Congratulations! all the children have an assigned gift! The list is empty");
                    } else {
                        System.out.println("You have chosen to see the list of children and gifts that are unassigned");
                        System.out.println(" ");
                        int numberOfChildrenThatDontHaveAGift = children.size();
                        System.out.println("The number of children that still don't have a gift is => " + numberOfChildrenThatDontHaveAGift + "! HERE IS A LIST:");
                        System.out.println(" ");
                        System.out.println("**********************************");
                        children.forEach(System.out::println);
                        System.out.println(" ");
                        int numberOfGiftsStillUnassigned = gifts.size();
                        System.out.println("the number of gifts still unassigned is => " + numberOfGiftsStillUnassigned + "! HERE IS A LIST:");
                        System.out.println(" ");
                        System.out.println("**********************************");
                        gifts.forEach(System.out::println);
                        menuAgain.printMenuAgain();
                    }
                    break;
                case 5:
                    if (children.size() == 0) {
                        System.out.println("All the children have already been assigned a gift :)");
                    } else {
                        System.out.println("You have chosen to randomly assign a gift to all the children that don't have gifts yet");
                        System.out.println("here is your new list :)");
                        System.out.println(" ");
                        String newPairs;
                        for (int l = 0; l < children.size(); l++) {
                            Collections.shuffle(gifts);
                            String randomChildagain = children.get(l);
                            String randomGiftagain = gifts.get(l);
                            newPairs = children.get(l) + " is going to get a " + gifts.get(l);
                            newListOfChildren.add(newPairs);
                            newListOfRandomChildren.add(randomChildagain);
                            newListOfRandomGifts.add(randomGiftagain);
                        }
                        children.removeAll(newListOfRandomChildren);
                        gifts.removeAll(newListOfRandomGifts);
                        newListOfChildren.forEach(System.out::println);
                        menuAgain.printMenuAgain();
                    }
                    break;
                case 6:
                    if (children.size() == 0) {
                        System.out.println("I'm sorry, all the children already have gifts, if you would like to add another child please PRESS [2]");
                    } else {
                        System.out.println("You have chosen to assign a GIFT to a CHILD :)");
                        System.out.println("Here is a list of remaining children and gifts, please enter exactly as writen in list");
                        System.out.println("******* CHILDREN *******");
                        children.forEach(System.out::println);
                        System.out.println("******* GIFTS *******");
                        gifts.forEach(System.out::println);
                        System.out.println(" ");
                        String nameFromList = Input.enterNameFromList();
                        String giftFromList = Input.enterGiftFromList();
                        if (children.contains(nameFromList) && gifts.contains(giftFromList)) {
                            String pickedChildAndGift = nameFromList + " is going to get a " + giftFromList;
                            newListOfChildren.add(pickedChildAndGift);
                            System.out.println("Great! " + pickedChildAndGift);
                            menu.printMenuAgain();
                        } else {
                            System.out.println("I'm sorry there is no such name and/or gift is in our list, please press [6] and try again");

                        }
                    }
                    break;
                default:
                    System.out.println("!!!!!You have entered an invalid symbol, please enter a number from the menu below!!!!!");
                    menuAgain.printMenuAgain();
                    break;
            }

        } while (menuNumber < 1000);

    }
}