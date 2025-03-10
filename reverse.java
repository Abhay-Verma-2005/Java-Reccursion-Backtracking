import java.util.*;

public class reverse{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
            int t = sc.nextInt();
            System.out.println(rev(t));
        
    }
    public static int rev(int a){
        int n=0;
        while(a>0){
            int rem=a%10;
            n=n*10+rem;
            a=a/10;
        }return n;
    }
}