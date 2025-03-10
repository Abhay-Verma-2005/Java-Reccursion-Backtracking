
public class subsequence_recc {
    public static void main(String[] args){
        String s ="010";
        subSeq(s, "");  
    }
    public static void subSeq(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return; 
        }   
        char ch =s.charAt(0);
        subSeq(s.substring(1),ans);
        subSeq(s.substring(1),ans+ch);
    }
}
