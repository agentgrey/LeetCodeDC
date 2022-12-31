
class Solution {
    public int uniquePathsIII(int[][] grid) {
        int count = 0 , a = 0, b = 0 ;
        for(int i = 0; i < grid.length ; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 0)   count++;
                   else if(grid[i][j] == 1){
                    a = i;
                    b = j;
                }
            }
        }
        return helper(grid, a, b, count);
    }
    private int helper(int[][] grid, int i, int j, int count){
        if(i< 0 || j< 0 || i>= grid.length || j>= grid[0].length || grid[i][j] == -1)
           return 0;
        if(grid[i][j] == 2)
           return count == -1 ? 1 : 0;
        grid[i][j] = -1;
        count--;
        int totalCount = helper(grid, i+ 1, j, count) + helper(grid, i, j+ 1, count) +
                         helper(grid, i- 1, j, count) + helper(grid, i, j- 1, count);
        grid[i][j] = 0;
        count++;

        return totalCount;
    }
}