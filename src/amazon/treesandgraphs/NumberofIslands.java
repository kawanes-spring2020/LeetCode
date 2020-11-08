package amazon.treesandgraphs;

public class NumberofIslands {
    public int numIslands(char[][] grid) {
        if(grid.length==0)
            return 0;
        int count = 0;
        int imax = grid.length-1;
        int jmax = grid[0].length-1;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]=='1'){
                    count+=dfs(grid, i, j);
                }
            }
        }

        return count;
    }

    public int dfs(char[][] grid, int i, int j){
        if(i<0 || i>grid.length-1 || j<0 || j>grid[i].length-1 || grid[i][j]=='0')
            return 0;

        grid[i][j] = '0';
        dfs(grid, i+1,j);
        dfs(grid, i-1,j);
        dfs(grid, i,j+1);
        dfs(grid, i,j-1);

        return 1;
    }
}
