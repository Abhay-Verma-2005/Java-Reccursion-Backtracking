public class permutaion_str_reccur {
    public static void main(String[] args) {
        String ques="abc";
        print(ques,"");
    }
    public static void print(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<ques.length();i++){
            char ch=ques.charAt(i);
            String rest = ques.substring(0, i) + ques.substring(i + 1);
            print(rest,ans+ch);
        }
    }
}
