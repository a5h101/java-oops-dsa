import java.util.HashMap;
import java.util.Map;

public class hashset {
    public static void main(String[] args) {
        //person age
        Map<String,Integer> map = new HashMap<String, Integer>();

        map.put("Dom",20);
        map.put("Som",19);
        map.put("Pom",18);

        System.out.println(map);


        boolean emp = map.isEmpty();
        System.out.println(emp);

        if(map.containsKey("Dom"))
            System.out.println(map.get("Dom"));
        else
            System.out.println(map.get("Dom"));


        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.print(e.getKey()+" ");
        }

        System.out.println();

        for(Map.Entry<String,Integer> el: map.entrySet())
            System.out.println(el);
    }
}
