import java.util.*;

public class Collection {
    public static void main(String[] args) {
        // Create a List of Objects
        List<Object> list = new ArrayList<>();

        // Add elements to the list
        list.add("Hello");
        list.add(123);
        list.add(3.14);
        list.add(true);
        Object[] arr=new Object[3];
        arr[0]="hi";
        arr[1]=90;
        arr[2]=true;
        System.out.println(Arrays.toString(arr));


        // Print the list
      //  System.out.println(list);
    }
}
