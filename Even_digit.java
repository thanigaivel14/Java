import java.util.Scanner;

public class Even_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,345,2,6,7896};
        System.out.print("the even digits are:");
        System.out.println(findingeven(arr));

    }
    static int findingeven(int []arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if (even(arr[i])){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        return numberof2(num)%2==0;
    }
    static int numberof(int num){
        int count=0;
        while(num!=0){
            count++;
            num=num/10;
        }

        return count;
    }
    static int numberof2(int num){
        return (int)(Math.log10(num)+1);
    }

}
