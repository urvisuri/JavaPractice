public class LoopIterate 
{
    public static void main(String[] args) 
    {
    //iteration
    int arr[]={1,2,3,4,5};

    for(int i=0;i<=4;i++){
        System.out.print(arr[i]+" ");
    }
    
    System.out.println();

    for(int val:arr){
        System.out.print(val+" ");
    }
    System.out.println();
    }

}
