public class Nqueens {
    static int n=4;
    static boolean[][] board=new boolean[n][n];
     public static void solve(int row){
        if(row==n){
            printBoard();
            System.out.println();
            return;
        }
        for(int col=0;col<n;col++){
            if(isSafe(row,col)){
                board[row][col]=true;
                solve(row+1);
                board[row][col]=false;
            }
        }
     }
     static boolean isSafe(int row,int col){
        for(int i=0;i<row;i++){
            if(board[i][col])
                return false;
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j])
                return false;
        }
        for(int i=row-1,j=col+1;i>=0 &&j<n;i--,j++){
            if(board[i][j])
                return false;
        }
        return true;
     }
     static void printBoard(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j])
                    System.out.print("Q");
                else
                    System.out.print(".");
            }
            System.out.println();
        }
     }
     public static void main(String[] args){
        solve(0);
     }
}