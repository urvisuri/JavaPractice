public class Oops {
    public static void main(String[] args) {
        Pen p= new Pen();
        p.color="black";
        p.type="gel";
        p.write();
        p.color();
    }
}

class Pen {
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
}