import java.util.LinkedHashMap;
import java.util.Map;

public class MapObject
{
    public static void main(String args[])
    {
        /*creating a Map with two key value pairs*/
        Map<String,String> map = new LinkedHashMap<>();
        map.put("Active","java");
        map.put("Renewals","c++");
        map.put("Application","15");
        System.out.println(map);

        /*Replacing the value of second key with first value */
        map.replace("Application",map.get("Renewals"));
        map.replace("Renewals",map.get("Active"));
        map.replace("Active","\"\"");

        System.out.println(map);


    }
}
