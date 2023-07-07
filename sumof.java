import java.sql.Array;
import java.util.*;
public class sumof {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={3,2,4};
        int target=6;
        int[] arr1=new int[2];
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                   arr1[0]=i;
                   arr1[1]=j;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));

    }
}
