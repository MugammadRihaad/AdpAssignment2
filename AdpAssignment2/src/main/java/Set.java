import java.util.HashSet;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set {
    public static void main(String args[]){
     //HashSet
            HashSet<String> h = new HashSet<String>();

            // Adding elements into HashSet
            h.add("Coke");
            h.add("Sprite");
            h.add("Jive");
            h.add("Fanta");// adding duplicate elements

            // Display the HashSet
            System.out.println(h);
            System.out.println("List contains Coke or not:" +
                    h.contains("Coke"));

            // Remove items from HashSet using
            h.remove("Fanta");
            System.out.println("List after removing Fanta:"+h);

            // Iterating over hash set items
            System.out.println("Iterating over list:"+"\n");
            Iterator<String> i = h.iterator();
            while (i.hasNext())
                System.out.println(i.next());

     //TreeSet
        // Create a TreeSet
        SortedSet<String> drinks = new TreeSet<>();

        // Add new elements to a TreeSet
        drinks.add("Coke");
        drinks.add("Fanta");
        drinks.add("Sprite");
        drinks.add("Jive");

        System.out.println("Drinks Set : " + drinks);

        // Duplicate elements are ignored
        drinks.add("Fanta");
        System.out.println("After adding duplicate element \"Fanta\" : " + drinks);


        // This will be allowed because it's in lowercase.
        drinks.add("Coke");
        System.out.println("After adding \"Coke\" : " + drinks);




    }
}
