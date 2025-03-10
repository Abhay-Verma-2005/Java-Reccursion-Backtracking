public class pow_reccur {
    public static void main(String[] args) {
        System.out.println(powe(3,4));
    }
    public static int powe(int a, int n) {
        if(n==1){
            return a;
        }
        return a*powe(a,n-1);
    }
}
