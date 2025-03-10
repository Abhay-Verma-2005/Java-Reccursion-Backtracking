
public class mazeURLD{
    public static void main(String[] args) {
        int row=3;
        int col=3;
        boolean[][] arr = new boolean[row][col];
        print(0,0,2,2,"",arr);
        
    }
    public static void print(int sc,int sr,int ec,int er,String s,boolean[][] arr){
        if(sc<0 || sr<0) return;
        if(sc>ec || sr>er)  return;
        if(sc==ec && sr==er){
            System.out.println(s);
            return;
        }
        if(arr[sr][sc]==true) return;
        arr[sr][sc]=true;
        //for right
        print(sc+1,sr,ec,er,s+"R",arr);
        // for down
        print(sc,sr+1,ec,er,s+"D",arr);
         // for left
         print(sc-1,sr,ec,er,s+"L",arr);
          // for up
        print(sc,sr-1,ec,er,s+"U",arr);

        arr[sr][sc]=false;
        
    }
}