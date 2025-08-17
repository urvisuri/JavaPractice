public class ArrayAdd
{
    public static void main(String[] args) 
    {

    int[] a = {1, 2, 3};
    int[] b = {4, 5, 6};
    int[] result = new int[a.length];

    for (int i = 0; i < a.length; i++) {
    result[i] = a[i] + b[i];
}

    for (int num : result) {
    System.out.print(num + " "); 
} 
    
} 
}
