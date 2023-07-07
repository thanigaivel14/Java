package Binary_search;
public class Rotated_array {
    public static void main (String [] args){
        int [] arr={4,5,6,7,1,2};
        int target=2;
        System.out.println(Pivot(arr));
        System.out.println(search(arr,target));
    }
    static int search(int []arr,int target){
        int pivo=Pivot(arr);
        if(pivo==-1){
            return BinarySearch(arr,target,0,arr.length-1);
        }
        if(arr[pivo]==target){
            return pivo;
        }
        if(arr[0]>target){
            return BinarySearch(arr,target,pivo+1,arr.length-1);
        }
        return BinarySearch(arr,target,0,pivo);


    }
    static int BinarySearch(int [] arr,int target,int st,int end){

        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
            if(arr[mid]==target) {
                return mid;
            }
        }
        return -1;
    }
    static int Pivot(int [] arr){
        int st=0,end=arr.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            //case 1
            if( mid>end &&arr[mid]>arr[mid+1]){
                return mid;
            }
            if( mid>st && arr[mid-1]>arr[mid]){
                return mid-1;
           }
            if(arr[mid]>arr[st]){
                st=mid+1;
            }
            else {
                end=mid;
            }

        }
        return -1;
    }
}
