//package santasList;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Random;
//
//public class Lists {
//    public static void listOfChildren() {
//        List<String> children = new ArrayList<>();
//        children.add("Dianne Ameter");
//        children.add("Bodrum Salvador");
//        children.add("Hilary Ouse");
//        children.add("Indigo Violet");
//        children.add("Hans Down");
//        children.add("Shequondolisa Bivouac");
//        children.add("Ingredia Nutrisha");
//        children.add("Fig Nelson");
//        children.add("Benjamin Evalent");
//        children.add("Gustav Purpleson");
//        children.add("Elon Gated");
//        children.add("Gootsy Porkins");
//        children.add("Cornbread Stevens");
//        children.add("Slaps Guster");
//        int childrenListSize = children.size();
//        Collections.shuffle(children);
//        String randomChildrenList = children.get(childrenListSize - 1);
//    }
//
//        public static void randomChildrenList (){
//        Collections.shuffle(listOfChildren());
//        String result;
//            int randomIndex = (int) (Math.random() * children.size());
//            result = children.get(randomIndex);
//            System.out.println(result);
//        }
//
//        static List<String> gifts = new ArrayList<>();
//
//        public void setGifts (List < String > gifts) {
//            this.gifts = gifts;
//            gifts.add("Compass");
//            gifts.add("Banana");
//            gifts.add("Joystick");
//            gifts.add("Tamagotchi");
//            gifts.add("Drone");
//            gifts.add("Basketball ball");
//            gifts.add("Pear Watch");
//            gifts.add("Glasses");
//            gifts.add("Scooter");
//            gifts.add("Digimon");
//            gifts.add("Lego kit");
//            gifts.add("Visma internship");
//            gifts.add("Football ball");
//            gifts.add("Karaoke set");
//
//        }
//        //List<String> assignedList = Collections.shuffle(gifts);
//
//        public static void printOutListOfChildren () {
//            for (String s : children) {
//                System.out.println(s);
//            }
//        }
//        public static void printOutListOfGifts () {
//            for (String m : gifts) {
//                System.out.println(m);
//            }
//        }
//        static List<String> getRandomElement ()
//        {
//            Random rand = new Random(children.size());
//            double randomNumber = Math.floor(children.size() * rand.nextDouble());
//            int random = (int) randomNumber;
//            List<String> newList = new ArrayList<>();
//            for (int i = 0; i < random; i++) {
//                int randomIndex = rand.nextInt(children.size());
//                newList.add(children.get(randomIndex));
//                children.remove(randomIndex);
//            }
//            return newList;
//        }
//    }
//
