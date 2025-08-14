import java.util.*;

public class Hashing_map {
    public static void main(String[] args) {
        HashMap<String,Integer> map =new HashMap<>();
        
        //insertion 
        map.put("india",120);
        map.put("US", 30);
        map.put("china",140);
        map.put("Nepal", 90);
        System.out.println(map);

        // updating 
        map.put("china",100);
        System.out.println(map);

        //searching
        if(map.containsKey("china")){
            System.out.println("yes present");
        }
        else{
            System.out.println("not present ");
        }

        //to finad value 
        System.out.println(map.get("china"));
        System.out.println(map.get("singapore"));

        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.print(e.getKey());
            System.out.println(e.getValue());
        }

        System.out.println(map);
    }

}
