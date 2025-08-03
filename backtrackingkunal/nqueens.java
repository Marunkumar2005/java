package backtracking;

public class NQueens {

     static int queens(boolean[][] board,int row){
         if(row == board.length){
             display(board);
             System.out.println();
             return 1;

         }
         int count=0;//like maze to sum it all the paths

         //placing the queen and checking for every row and col
         for(int col=0;col< board.length;col++){
             //place the queen if it is safe
             if(isSafe (board,row,col)){
                 board[row][col]=true;// i have placed my queen
               count+=  queens(board,row+1);//to check the remaining the rows
                 //when we come out of function call removing the Q
                 board[row][col]=false;

             }
             //place the queen if it is safe

         }
         return count;

     }

     private static boolean isSafe(boolean[][] board,int row ,int col){
         //check vertical row
         for(int i=0;i<row;i++){
             if (board[i][col]){//to check vertical column of every row if it consists then return false
                 return false;

             }
         }


         //diagonal left
         int maxleft =Math.min(row ,col);
         for (int i=1;i<=maxleft;i++){
             if(board[row-i][col-i]){
                 return false;

             }
         }
         //diagonal right

         int maxright =Math.min(row , board.length-col-1);
         for (int i=1;i<=maxright;i++){
             if(board[row-i][col+i]){
                 return false;

             }
         }
         return true;

     }
//to display the queen matrix

     private static void display(boolean[][] board){
    for(boolean[] row:board){//for every row in my board
        for(boolean element:row){
            if(element){//if element is q
                System.out.print("Q"+" ");
            }
            else{
                System.out.print("X"+" ");
            }

        }
        System.out.println();
    }
     }
    public static void main(String[] args) {
         int n=4;

boolean[][] board =new boolean[n][n];
        System.out.println( queens(board,0));

    }
}
