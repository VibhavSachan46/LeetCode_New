class Solution {
    public boolean isValidSudoku(char[][] board) {
         for(int i = 0; i<9; i++)
         {
             HashSet<Character> row = new HashSet<Character>();
             HashSet<Character> col = new HashSet<Character>();
             HashSet<Character> box = new HashSet<Character>();
             for(int j=0; j<9; j++)
             {
                 if(board[i][j] != '.')
                 {
                     if(row.contains(board[i][j]))
                     {
                         return false;
                     }
                     else
                     {
                         row.add(board[i][j]);
                     }
                 }
                 
                 if(board[j][i] != '.')
                 {
                     if(col.contains(board[j][i]))
                     {
                         return false;
                     }
                     else
                     {
                         col.add(board[j][i]);
                     }
                 }
                 
                 int RowIndex = 3*(i/3);
                 int ColIndex = 3*(i%3);
                 
                 if(board[RowIndex + j/3][ColIndex + j%3]!='.')
                 {
                     if(box.contains(board[RowIndex + j/3][ColIndex + j%3]))
                     {
                         return false;
                     }
                     else
                     {
                         box.add(board[RowIndex + j/3][ColIndex + j%3]);
                     }
                 }
             }
         }
        return true;
    }
}