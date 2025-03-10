
public class maze{
    public static void main(String[] args) {
        int ec=2;
        int er=2;
        print(0,0,ec,er,"");
    }
    public static void print(int sc,int sr,int ec,int er,String s){
        if(sc>ec || sr>er)  return;
        if(sc==ec && sr==er){
            System.out.println(s);
            return;
        }
        //for right
        print(sc+1,sr,ec,er,s+"R");
        // for down
        print(sc,sr+1,ec,er,s+"D");
    }
}