package Binary_search;
import java.util.*;
public class Infinet_array {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,77,88,99,90};
        int target=3;
        int ans=size(arr,target);
        System.out.println(ans);
    }
    static int size(int arr[],int target){
        int st=0,end=1;
        while(target>arr[end]){
            int newst=st;
            end=end+(end-st+1)*2;
            st=newst;
        }
        int search = search(arr, target, st, end);
        return search;
    }
    static int search(int arr[],int target,int st,int end){
        while(st<=end){
            int mid=st+(end-st)/2;
            if(target>arr[mid]){
                st=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
return -1;
    }
}
