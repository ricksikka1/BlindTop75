class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return null;
        }
        List<List<Integer>> res = new ArrayList();
        int[][] pacific = new int[matrix.length][matrix[0].length];
        int[][] atlantic = new int[matrix.length][matrix[0].length];
        
        for(int col = 0; col < matrix[0].length; col++){
            bfs(matrix, 0, col, Integer.MIN_VALUE, pacific);
            bfs(matrix, matrix.length-1, col, Integer.MIN_VALUE, atlantic);
        }
        for(int row = 0; row < matrix.length; row++){
            bfs(matrix, row, 0, Integer.MIN_VALUE, pacific);
            bfs(matrix, row, matrix[0].length-1, Integer.MIN_VALUE, atlantic);
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(pacific[i][j] == 1 && atlantic[i][j] == 1){
                    res.add(Arrays.asList(i, j));
                }
            }
        }
        return res;
    }
    
    public void bfs(int[][] matrix, int row, int col, int prev, int[][] ocean){
        if(row < 0 || col < 0 || row > matrix.length-1 || col > matrix.length-1){
            return;
        }
        if(ocean[row][col] == 1){
            return;
        }
        if(matrix[row][col] < prev){
            return;
        }
        
        ocean[row][col] = 1;
        
        bfs(matrix, row+1, col, matrix[row][col], ocean);
        bfs(matrix, row, col+1, matrix[row][col], ocean);
        bfs(matrix, row-1, col, matrix[row][col], ocean);
        bfs(matrix, row, col-1, matrix[row][col], ocean);
           
    }
}