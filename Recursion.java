public class Recursion {
    public static void main(String[] args) {
        System.out.println(sumN(10));
    }
    public static int sumN(int n) {
        if(n==0){
            return n;
        }
        return n+sumN(n-1);
    }
}
