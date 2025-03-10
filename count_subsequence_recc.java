
public class count_subsequence_recc {
    public static void main(String[] args){
        String s ="abc";
        // subSeq(s, "");
        // System.out.print("\n"+count);

        System.out.println(Count_subSeq(s, ""));
    }
// static int count=0;
//     public static void subSeq(String s,String ans){
//         if(s.length()==0){
//             System.out.print(ans+" ");
//             count++;
//             return; 
//         }
//         char ch =s.charAt(0);
//         subSeq(s.substring(1),ans);
//         subSeq(s.substring(1),ans+ch);
//     }

    public static int Count_subSeq(String s,String ans){
        if(s.length()==0){
            System.out.print(ans+" ");
            return 1; 
        }
        char ch =s.charAt(0);
        int a= Count_subSeq(s.substring(1),ans);
        int b= Count_subSeq(s.substring(1),ans+ch);
        return a+b;
    }

}
