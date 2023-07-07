
package Binary_search;
import java.util.*;
public class First_and_Last {
    public static void main(String [] args){
        int arr[]={1,2,3,5,5,5,5,6,7,8};
        int target=5;
        search(arr,target);

    }
    static void search(int arr[],int target1){
        int ans[]={-1,-1};
        ans[0]=Index(arr,target1,true);
        ans[1]=Index(arr,target1,false);
        System.out.println(Arrays.toString(ans));
    }
    static int Index(int arr[],int target,boolean right){
        int st=0,end=arr.length-1;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                st=mid+1;
            }
            else {
                ans=mid;
                if(right){
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
        }
        return ans;
    }
}
