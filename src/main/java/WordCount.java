import java.util.*;

public class WordCount
{
    public static void main(String[] args)
    {
        System.out.println("enter the string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map<String, Integer> unique = new LinkedHashMap<String, Integer>();

        /*splits the string based on conditions given in split*/

        for (String string : str.split("\\s+|-+|\\?+|,+|\\*|_+|@+|  +"))
        {
            if(unique.get(string) == null)
                unique.put(string, 1);
            else
                unique.put(string, unique.get(string) + 1);
        }
        String uniqueString = join(unique.keySet(), ", ");
        List<Integer> value = new ArrayList<Integer>(unique.values());

        System.out.println("Output = " + uniqueString);
        System.out.println("Values = " + value);

    }

    public static String join(Collection<String> s, String delimiter)
    {
        StringBuffer buffer = new StringBuffer();
        Iterator<String> iter = s.iterator();
        while (iter.hasNext())
        {
            /*append string representation of boolean argument to sequence*/

            buffer.append(iter.next());
            if (iter.hasNext())
            {
                buffer.append(delimiter);
            }
        }
        return buffer.toString();
    }
}
