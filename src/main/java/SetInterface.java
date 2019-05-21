import java.util.ArrayList;
import java.util.Collections;

public class SetInterface
{
    public static void main(String[] args)
    {
        // Create a list of strings
        ArrayList<String> al = new ArrayList<String>();
        al.add("Harry");
        al.add("Olive");
        al.add("Alice");
        al.add("Bluto");
        al.add("Eugene");

        /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
        Collections.sort(al);

        // Let us print the sorted list
        System.out.println("List after the use of" +
                " Collection.sort() :\n" + al);
    }
}
