import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("my name is","divyanshu");
        map.put("my father name is","rajeev sharma");
        map.put("my mother name is","indresh sharma");
        Set<String> keys=map.keySet();
        for(String key: keys)
        {
            System.out.println(key+ " "+map.get(key));

        }


    }
}
