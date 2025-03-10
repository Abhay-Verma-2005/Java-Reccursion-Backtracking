
public class mazeURLD_blocks{
    public static void main(String[] args) {
        int[][] amaze={
                    {0,1,1,1},
                    {0,0,1,0},
                    {0,0,0,0},
                    {1,0,0,0}
                };
        print(0,0,3,3,"",amaze);
        
    }
    public static void print(int sc,int sr,int ec,int er,String s,int[][] amaze){
        if(sc>ec || sr>er)  return;
        if(amaze[sr][sc]==1) return;
        if(sc==ec && sr==er){
            System.out.println(s);
            return;
        }
        //for right
        print(sc+1,sr,ec,er,s+"R",amaze);
        // for down
        print(sc,sr+1,ec,er,s+"D",amaze);
    }
}