public class lexical_numz {
    public static void main(String[] args) {
        int n=13;
        subSeq(n, 0);
    }
    public static void subSeq(int n,int t){
        if(t>n){
            return;
        }
        System.out.println(t);
        int i=0;
        if(t==0){
            i=1;
        }
        for(; i<=9;i++){
            subSeq(n,t*10+i);
        }
    }
}
