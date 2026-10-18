class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        
        int[][] arr=new int[grid.length][grid[0].length];
        int r=grid.length;
        int c=grid[0].length;
        int t=0;int t1=0;
        int prv=0;
        int prv1=0;
        while(t>=0 && t<r && t1>=0 && t1<c)
        {
            if(arr[t][t1]==0)
            {
                arr[t][t1]=1; 
                prv=t;
                prv1=t1;
            }
            else
            {
                break;
            }
            if(grid[t][t1]=='R')
            {
                t1++;
            }
            else if(grid[t][t1]=='L')
            {
                t1--;
            }
            else if(grid[t][t1]=='D')
            {
                t++;
            }
            else
            {
                t--;
            }
        }
        int[] arr1={prv,prv1}; 
        return arr1;
    }
}