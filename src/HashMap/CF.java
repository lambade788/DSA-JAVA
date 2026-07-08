package HashMap;

import java.util.HashMap;
import java.util.Map;

public class CF {
    public static void main(String[] args) {
        Map<String,Integer> H = new HashMap<>();

        H.put("Rahul",21);
        H.put("Omkar",22);
        H.put("Aakash",24);
        H.put("Ravi",25);

        System.out.println(H.get("Rahul"));
        System.out.println(H.get("San"));

        H.remove("Ravi");
        System.out.println(H.remove("San"));

        System.out.println(H.keySet());
        System.out.println(H.values());
        System.out.println(H.entrySet());

        H.putIfAbsent("San",88);

//        m-1
        for(String key:H.keySet()){
            System.out.printf("Age of %s is & %d \n",key,H.get(key));
        }

        System.out.println();
//        m-2
        for(Map.Entry<String ,Integer> e:H.entrySet()){
            System.out.printf("Age of %s is & %d \n",e.getKey(),e.getValue());
        }

//        m-3
        System.out.println();

        for (var e : H.entrySet()) {
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
    }
}
