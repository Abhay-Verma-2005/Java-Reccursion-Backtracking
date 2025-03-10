public class Per_Coin2 {
    public static void main(String[] args) {
       int [] coin = {1,2,3,5};
       int amt=5;
       perCoin(coin,amt,"",0);
    }
    public static void perCoin(int[] coin ,int amt, String ans,int idx){
        if(amt==0){
            System.out.println(ans);
            return;
        }
        for(int i=idx;i<coin.length;i++){
            if(amt >= coin[i]){
                perCoin(coin, amt-coin[i], ans+coin[i],i);
            }
        }

    }
}

//infinite i+1
// finite ke liye idx=i
// permutation