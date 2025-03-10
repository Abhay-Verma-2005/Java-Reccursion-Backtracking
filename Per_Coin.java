public class Per_Coin {
    public static void main(String[] args) {
       int [] coin = {1,2,3,5};
       int amt=5;
       perCoin(coin,amt,"");
    }
    public static void perCoin(int[] coin ,int amt, String ans){
        if(amt==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<coin.length;i++){
            if(amt >= coin[i]){
                perCoin(coin, amt-coin[i], ans+coin[i]);
            }
        }

    }
}


// permutation