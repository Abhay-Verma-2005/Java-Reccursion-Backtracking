public class print_dec {
    public static void main(String[] args) {
        dec(10);
    }
    public static void dec(int n) {
        if(n==0){
           return; 
        }
        System.out.print(n+" ");
        dec(n-1);
        }
    }
