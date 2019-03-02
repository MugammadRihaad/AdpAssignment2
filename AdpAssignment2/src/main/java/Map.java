import java.util.HashMap;

public class Map {
    public static void main(String args[]){
        // Create a HashMap object called capitalCities
        HashMap<String, String> drinks = new HashMap<String, String>();

        // Add keys and values (Country, City)
        drinks.put("Orange", "FantaOrange");
        drinks.put("Black", "Coke");
        drinks.put("Yellow", "MountainDew");
        drinks.put("Grey", "Stoney");
        System.out.println(drinks);
        //Access Item
        drinks.get("Coke");
        //Remove Item
        drinks.remove("Coke");
        //HashMap Size
        drinks.size();


    }
}
