class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        int numsRows=rowIndex+1;
       int[][] arr=new int[numsRows][numsRows];
       for(int i=0;i<numsRows;i++)
       {
           arr[i][0]=1;
       }
       int t=0;
       for(int i=0;i<numsRows;i++)
       {
           arr[i][t]=1;
           t++;
       }
       for(int i=2;i<arr.length;i++)
       {
          for(int j=1;j<=i;j++)
          {
             arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
          }
       }
       ArrayList<Integer> arr1=new ArrayList<>();
       for(int i=0;i<=rowIndex;i++)
       {
            arr1.add(arr[rowIndex][i]);
       }
       return arr1;
    }
}