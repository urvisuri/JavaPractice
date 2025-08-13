import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> l =new ArrayList<Integer>();
        l.add(0);
        l.add(1);

        System.out.println(l);


        //get
        int element=l.get(0);
        System.out.println(element);

        //add
        l.add(1,4);
        l.add(0,5);
        l.add(8);
        l.add(6);
        System.out.println(l);


        //set
        l.set(1,3);
         System.out.println(l);


        //delete
        l.remove(2);
        System.out.println(l);

        //size
        int size=l.size();
        System.out.println(size);

        //loops
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }

        //sort
        Collections.sort(l);
        System.out.println(l);
    }
    
}
