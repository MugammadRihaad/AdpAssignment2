import java.util.ArrayList;
import java.util.LinkedList;

import java.util.Vector;

public class List {
    public static void main(String args[]){
        //arrayList
                ArrayList<String> list=new ArrayList<String>();//Creating arraylist
                list.add("Coke");//Adding object to arraylist
                list.add("Jive");
                list.add("Fanta");
                list.add("Sprite");
                //Invoking arraylist object
                System.out.println("ArrayList objects "+list+"\n");

        //LinkedList
                // Creating a LinkedList
                LinkedList<String> drinks = new LinkedList<>();

                // Adding new elements to the end of the LinkedList using add() method.
                drinks.add("Coke");
                drinks.add("Sprite");
                drinks.add("Fanta");
                drinks.add("Jive");

                System.out.println("Initial LinkedList : " + drinks);


                // Adding an element at the specified position in the LinkedList
                drinks.add(3, "Jive");
                System.out.println("After add(3, \"Jive\") : " + drinks);

                // Adding an element at the beginning of the LinkedList
                drinks.addFirst("Coke");
                System.out.println("After addFirst(\"Coke\") : " + drinks);

                // Adding an element at the end of the LinkedList (This method is equivalent to the add() method)
                drinks.addLast("Fanta");
                System.out.println("After addLast(\"Fanta\") : " + drinks);

                // Adding all the elements from an existing collection to the end of the LinkedList
                ArrayList<String> cooldrinks = new ArrayList<>();
                cooldrinks.add("mountain dew");
                cooldrinks.add("Appletizer");

                drinks.addAll(cooldrinks);
                System.out.println("After addAll(cooldrinks) : " + drinks+"\n");

         //Vector
                Vector<String> vct = new Vector<String>();
                //adding elements to the end
                vct.add("Fanta");
                vct.add("Coke");
                vct.add("Sprite");
                System.out.println(vct);
                //adding element at specified index
                vct.add(2,"Random");
                System.out.println(vct);
                //get elements by index
                System.out.println("Element at index 3 is: "+vct.get(3));
                //get first element
                System.out.println("The first element of this vector is: "+vct.firstElement());
                //get last element
                System.out.println("The last element of this vector is: "+vct.lastElement());
                // check vector is empty or not
                System.out.println("Is this vector empty? "+vct.isEmpty());

    }
}
