import java.util.*;

public class NQeens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] board =new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
		List<List<String>> list = new ArrayList<>();
        nqueen(board,0,n,list);
        for (int i = 0; i < list.size(); i++) {
            List<String> sublist = list.get(i);
            for (int j = 0; j < sublist.size(); j++) {
                System.out.println(sublist.get(j));
            }
            System.out.println();
        }
    }
   public static void nqueen(char[][] board,int row,int n,List<List<String>> list){
        if(n==row){
            List<String> ans=new ArrayList<>();
            for(int i=0;i<n;i++){
                String s="";
                for(int j=0;j<n;j++){
                    s+=board[i][j];
                }
                ans.add(s);
            }
            list.add(ans);
            return;
        }
        for(int j=0;j<n;j++){
            if(ispossible(board,row,j,n)){
                board[row][j]='Q';
                nqueen(board,row+1,n,list);
                board[row][j]='.';
            }
        }
    }
    public static boolean ispossible(char[][] board ,int row,int col, int n){
        // check row
        for(int j=0;j<n;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }
        // check coloumn
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //check NE
        int i=row;
        int j=col;
        while(i>=0 && j<n){
            if(board[i][j]=='Q'){
                return false;
            }
            i--;
            j++;
        }
        //check NW
        i=row;
        j=col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q'){
                return false;
            }
            i--;
            j--;
        }
        //check SW
        i=row;
        j=col;
        while(i<n && j>=0){
            if(board[i][j]=='Q'){
                return false;
            }
            i++;
            j--;
        }

        //check SE
        i=row;
        j=col;
        while(i<n && j<n){
            if(board[i][j]=='Q'){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}
