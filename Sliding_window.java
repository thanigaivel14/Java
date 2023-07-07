package Binary_search;

public class Sliding_window {
    public static void main(String[] args) {
        int[] arr={3000,10,1000,0,0,100,2000};
        int k=3;
        System.out.println(max(arr,k));
    }
    static int max(int arr[],int k){
        int wsum=0,msum=0;
        for(int i=0;i<k;i++) {
            wsum = wsum + arr[i];
        }
        msum=wsum;
        for(int i=k;i<=arr.length-1;i++){
            wsum=wsum+arr[i]-arr[i-k];
            if(wsum>msum) {
                msum = wsum;
            }

        }
        return msum;
    }
}
