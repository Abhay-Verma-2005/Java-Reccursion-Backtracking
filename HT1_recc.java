public class HT1_recc {
    public static void main(String[] args){
        int n=2;
        CoinToss2(n,"");
    }
    public static void CoinToss2(int n,String ans){
        if(n==0){
                System.out.println(ans);
                return;
                }
        CoinToss2(n-1,ans+"H ");
        CoinToss2(n-1,ans+"T ");
    }
}
