package Binary_search;
import java.util.*;

public class PeakIndex {
    public static void main(String []args){
        int[] arr={1, 2, 1, 3, 5, 6, 4};
        int ans=Index(arr);
        System.out.println(ans);
    }
     static int Index(int []arr){
        int st=0;
        int end=arr.length-1;
        while(st<end){
            int mid=st+(end-st)/2;
            if(arr[mid]>arr[mid+1]){
                //in the decreasing order
                end=mid;
            }
            else if(arr[mid]<arr[mid+1]){
                //in the increasing order
                st=mid+1;

            }

        }
        return arr[end];
    }
}
