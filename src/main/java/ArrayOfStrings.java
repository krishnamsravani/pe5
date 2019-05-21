import java.util.*;

public class ArrayOfStrings
{
        public static void main(String[] args)
        {
            /*create a new string*/
            System.out.println("enter the string:");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            Map<String, Boolean> unique = new LinkedHashMap<String, Boolean>();
            for (String string : str.split("\\s+|-+|\\?+|,+|\\*|_+|@+|  +"))
            {
                if(unique.get(string) == null)
                    unique.put(string, false);
                else
                    unique.put(string, true);
            }
            String uniqueString = join(unique.keySet(), ", ");

            /*creating a new list value*/

            List<Boolean> value = new ArrayList<Boolean>(unique.values());

            System.out.println("Output = " + uniqueString);
            System.out.println("Values = " + value);

        }

        public static String join(Collection<String> s, String delimiter)
        {
            StringBuffer buffer = new StringBuffer();
            Iterator<String> iter = s.iterator();
            while (iter.hasNext())
            {
                buffer.append(iter.next());
                if (iter.hasNext())
                {
                    buffer.append(delimiter);
                }
            }
            return buffer.toString();
        }
    }


