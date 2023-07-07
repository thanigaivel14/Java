package Binary_search;
public class Infinite {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,12,14,15,16,66,77,88,99,999,999999,999999,99999999};
        int target=90;
        System.out.println(ans(arr,target));
    }
    static int ans(int []arr,int target){
        int st=0,end=1;
        while(target>arr[end]){
            int newst=end+1;
            end=end+(end-st+1)*2;
            st=newst;
        }
        return binary (arr,target,st,end);
    }
    static int binary(int []arr,int target,int st,int end){
        while(st<=end){
            int mid=st+(end-st)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                st=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
