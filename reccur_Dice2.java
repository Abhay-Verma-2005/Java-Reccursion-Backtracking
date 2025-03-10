public class reccur_Dice2 {
    public static void main(String[] args) {
       int n=3;
       dice_Throw2(n,0,"");
    }
    public static void dice_Throw2(int n ,int curr, String ans){
        if(curr==n){
            System.out.println(ans);
            return;
        }
        if(curr>n) {
            return;
        }
        for(int i=1;i<=3;i++){
            dice_Throw2(n,curr+i,ans+i);
        }

    }
}
