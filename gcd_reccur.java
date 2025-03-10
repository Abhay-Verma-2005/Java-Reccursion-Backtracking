public class gcd_reccur {
    public static void main(String[] args) {
        System.out.println(gcde(8,28));
    }
    public static int gcde(int a, int b) {
        if (b==0) return a;
        return gcde(b,b%a);
    }
}
