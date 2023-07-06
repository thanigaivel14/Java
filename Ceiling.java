package Binary_search;
import java.util.*;
public class Ceiling {
    public static void main(String[] args){
        int [] sorted ={2,3,4,5,7,8,9,11};
        Scanner sc=new Scanner(System.in);
         int target= sc.nextInt();
         int start=0 ,end= sorted.length-1;
         while(start<=end){
             int mid=start+(end-start)/2;
             if(target>sorted[mid]){
                 start=mid+1;
             }
             else if(target<sorted[mid]){
                 end=mid-1;
             }
             else{
                 System.out.println("the ceiling of the number is:"+sorted[start]);
             }
         }
        System.out.println("the ceiling of the number is:"+sorted[end]);

    }
}
