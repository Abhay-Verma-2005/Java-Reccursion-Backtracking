import java.util.*;
public class Arr_subsequence_recc {
    public static void main(String[] args) {
        String s = "abc";
        List<String> subsequences = Count_subSeq(s, "");
        System.out.println(subsequences);
    }

    public static List<String> Count_subSeq(String s, String ans) {
        List<String> result = new ArrayList<>();
        if (s.length() == 0) {
            result.add(ans);
            return result; 
        }
        char ch = s.charAt(0);
        result.addAll(Count_subSeq(s.substring(1), ans)); 
        result.addAll(Count_subSeq(s.substring(1), ans + ch));
        return result;
    }
}
