class Solution {
    public boolean exist(char[][] board, String word) {
        if(board.length == 0){
            return false;
        }
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(search(board, word, i, j, 0)){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public boolean search(char[][] board, String word, int i, int j, int index){
        if(i < 0 || j < 0 || i > board.length-1 || j > board[0].length-1){
            return false;
        }
        if(index == word.length()-1) return true;
        if(word.charAt(index) != board[i][j]) return false;
        
        char temp = board[i][j];
        
        boolean found = search(board, word, i+1, j, index+1) || search(board, word, i, j-1, index+1) || search(board, word, i-1, j, index+1) || search(board, word, i, j+1, index+1);
        
        board[i][j] = temp;
        return found;
    }
}