public class LL {

    private int size;
    LL(){
        this.size=0;
    }
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
//ADD FIRST AND LAST 

    public void addfirst(String data){
        Node newnode = new Node(data);
        if(head==null){
            head= newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void addlast(String data){
        Node newnode = new Node(data);
        if(head==null){
            head= newnode;
            return;
        }
        Node currnode= head;
        while(currnode.next!=null){
            currnode=currnode.next;
        }
        currnode.next=newnode;
    }


//DELETE FIRST AND LAST 
    public void deletefirst()
    {
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        head=head.next;
    }


     public void deletelast()
    {
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondlast=head;
        Node lastnode=head.next;
        while(lastnode.next!=null){
            lastnode=lastnode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
    }


//SIZE
    public int getsize(){
        return size;
    }

    public void printlist(){
        if(head==null){
            System.out.print("string is empty");
            return;
        }
        Node currnode = head;
        while(currnode !=null){
            System.out.println(currnode.data+" ");
            currnode=currnode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        LL list=new LL();
        list.addfirst("a");
        list.addfirst("is");
        list.addlast("linkedlist");
        list.addfirst("this");
        list.printlist();
        System.out.println("-----------");
        list.deletefirst();
        list.printlist();
        System.out.println("-----------");
        list.deletelast();
        list.printlist();
        System.out.println("-----------");
        System.out.println(list.getsize());
    }
}
