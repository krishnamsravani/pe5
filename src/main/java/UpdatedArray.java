import java.util.ArrayList;
import java.util.List;

public class UpdatedArray
{
    public static void main(String[] args) {

        // Create a list and add some fruits to the list
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Apple");
        list_Strings.add("Grape");
        list_Strings.add("Melon");
        list_Strings.add("Berry");


        // Print the list
        System.out.println(list_Strings);

        // Update the first element with "Kiwi"
        list_Strings.set(0, "Kiwi");

        // Update the third element with "Mango"
        list_Strings.set(2, "Mango");

        // Print the list again
        System.out.println(list_Strings);

        //clearing all the elements from the arraylist
        list_Strings.clear();
        System.out.println("arraylist after removing all elements:"+list_Strings);
    }
}
