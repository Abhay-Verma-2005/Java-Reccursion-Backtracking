// package RECURSION;
import java.util.*;
public class PalinArr {
    public static void main(String[] args) {
        String[]arr = {"PoP", "job", "aabbcc", "wabc", "anana", "ananya", "hope", "love", "yay", "lol"};

        ArrayList<String> arr2 = new ArrayList<>();
        for (int i=0;i<arr.length;i++) {
            if (isPalin(arr[i],0,arr[i].length()-1)) {
                arr2.add(arr[i]);
            }
        }
        System.out.println(arr2);
    }
    
    public static boolean isPalin(String str, int s, int e) {
        if(s>=e){
            return true;
        }
        else if(str.charAt(s) != str.charAt(e)){
            return false;
        }
        return isPalin(str,s+1, e-1) ;
    }
}
