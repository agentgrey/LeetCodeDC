class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> hs = new HashSet<>();
        
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                char c = board[i][j];
                
//                 System.out.println(c +" is in row "+i +"  "+ c +" is in column " +j +"  "                       + c +" is in subbox " +i/3 +"-" +j/3);
                if(c!='.') {
                    if((!hs.add(c +" is in row "+i)) 
                       || (!hs.add(c +" is in column " +j))                        
                       || (!hs.add(c +" is in subbox " +i/3 +"-" +j/3)))
                        
                        return false;
                }
            }
        }
        
        return true;
    }
}