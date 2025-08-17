import java.util.*;
class pen{
    //data
    String color;
    String type;
    //members
public void write(){
    System.out.println("writing");
}
public void color(){
    System.out.println(this.color);
}
public void type(){
    System.out.println(this.type);
}
//constructor
// pen(){

// }

//non parameterized constructor
// pen(){
//  System.out.println("const. called");
// }
//parameterized constructor
pen(String color,String type){
    this.color=color;
    this.type=type;
}

}

public class constructor {
    public static void main(String[] args) {
        pen p=new pen("black","gel") ;
        // p.color="black";
        // p.type="gel";
        p.write();
        p.color();
        p.type();
    }
}
