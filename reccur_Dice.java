public class reccur_Dice {
    public static void main(String[] args) {
       int n=3;
       dice_Throw(n,0,"");
    }
    public static void dice_Throw(int n ,int curr, String ans){
        if(curr==n){
            System.out.println(ans);
            return;
        }
        if(curr>n) {
            return;
        }

        dice_Throw(n,curr+1,ans+1);
        dice_Throw(n,curr+2,ans+2);
        dice_Throw(n,curr+3,ans+3);
    }
}
