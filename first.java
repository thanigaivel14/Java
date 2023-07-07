import java.util.*;
public class first {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [] arr={1,2,3,4,5,6,7,8,9};
        int target;
        System.out.print("enter the search element:");
        target=sc.nextInt();
        int ans=search( arr,target);
        System.out.println("the target element is in the index:"+ans);
    }
    static  int search(int arr[],int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }

        }
        return -1;
    }
}
