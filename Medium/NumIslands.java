class Solution {
    public int numIslands(char[][] grid) {
        
        if(grid.length == 0 || grid == null){
            return 0;
        }
        
        int num = 0;
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                if(grid[i][j] == '1'){
                    bfs(grid, i, j); 
                    num++;
                }
            }
        }
        
        return num;
    }
    
    public void bfs(char[][] grid, int i, int j){
        if(i > grid.length-1 || j > grid[0].length-1 || i < 0 || j < 0){
            return;
        }
        if(grid[i][j] == '0'){
            return;
        }
        
        grid[i][j] = '0';
        bfs(grid, i+1, j);
        bfs(grid, i, j+1);
        bfs(grid, i-1, j);
        bfs(grid, i, j-1);
    }
}