import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Comparator;

public class Thanos {

    public static void main(String[] args) {

        Hero hulk = new Hero("Hulk", 49);
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero thor = new Hero("Thor", 1501);
        Hero vision = new Hero("Vision", 3);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero doctorStrange = new Hero("Doctor Strange", 42);
        
        Flower lily = new Flower("Lily");
        Flower tulip = new Flower("Tulip");
        Flower begonia = new Flower("Begonia");
        Flower violet = new Flower("Violet");
        Flower rose = new Flower("Rose");

        // TODO 1 : Create a TreeMap where :
        // Hulk, Thor and Scarlet Witch have a Rose
        // Vision has a Tulip
        // Captain America has a Lily
        // Doctor Strange and Black Widow have a Violet
        Comparator<Hero> comparator = new Comparator<Hero>() {
            public int compare(Hero orig, Hero compare) {
                return orig.getName().compareTo(compare.getName());
            }
        };
        Map<Hero, Flower> treeThanos = new TreeMap<>(comparator);
        treeThanos.put(hulk, rose);
        treeThanos.put(thor, rose);
        treeThanos.put(scarletWitch, rose);
        treeThanos.put(vision, tulip);
        treeThanos.put(captainAmerica, lily);
        treeThanos.put(doctorStrange, violet);
        treeThanos.put(blackWidow, violet);

        // TODO 2 : Print if `begonia` is contained in the TreeMap
        Map<Hero, Flower> survivor = new HashMap<>();
        System.out.println(survivor.containsKey(begonia));

        // TODO 3 : For each hero, alphabetically, print the corresponding flower
        for (Hero hero : treeThanos.keySet()) {
            Flower flower = treeThanos.get(hero);
            System.out.println(hero.getName() + ": " + flower.getName());
        }
    }
}
