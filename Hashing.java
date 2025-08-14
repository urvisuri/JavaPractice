import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        //CREATING HASH
        HashSet<Integer> set =new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(0);
        set.add(7);
        set.add(5);

        //size
        System.out.println("size of set is : "+ set.size());

        //search
        if(set.contains(1)){
            System.out.println("conatins 1");
        }
        if(!set.contains(6)){
            System.out.println("does not conatins ");
        }
        //delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("does not conatins 1");
        }


        //iterator
        Iterator it =set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
