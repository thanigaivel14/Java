package Binary_search;
import java.util.*;
public class Smallest_letter {
    public static void main(String[] args) {
    char [] letter={'a','b','c','f'};
    char target ='a';
    int st=0,end=letter.length-1;
    while(st<=end){
        int mid=st+(end-st)/2;
        if(target<letter[mid]){
            end=mid-1;
        }
        else{
            st=mid+1;
        }
    }
        System.out.println(letter[st%letter.length]);










    }
}
