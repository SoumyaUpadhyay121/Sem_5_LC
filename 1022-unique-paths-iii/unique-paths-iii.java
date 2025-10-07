class Solution {
    int empty=1;
    int ans=0;
    public int uniquePathsIII(int[][] grid) {
// 1    Find start point and count total empty cells
// 2	DFS from start, visiting every cell exactly once
// 3	When reaching end, check if all cells visited
// 4	Use backtracking to explore all valid paths

        int n=grid.length,m=grid[0].length;
        int s=0,e=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0) empty++;

                if(grid[i][j]==1) {
                    s=i;
                    e=j;
                }
            }
        }


        dfs(grid,s,e,0);
        return ans;
    }


    public void dfs(int [][]grid,int x,int y,int count){
        if(x<0 || y<0 || x>=grid.length || y>=grid[0].length || grid[x][y]==-1){
            return ;
        }

        if(grid[x][y]==2){
            if(count==empty) ans++;
            return;
        }


        int temp=grid[x][y];
        grid[x][y]=-1;


        dfs(grid,x+1,y,count+1);
        dfs(grid,x-1,y,count+1);
        dfs(grid,x,y+1,count+1);
        dfs(grid,x,y-1,count+1);

        grid[x][y]=temp;
    }
}