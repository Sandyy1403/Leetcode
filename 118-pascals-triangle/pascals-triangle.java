class Solution {
    public List<List<Integer>> generate(int numsRows) {

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
       List<List<Integer>> arr1=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
       {  
          ArrayList<Integer> k=new ArrayList<>();
          for(int j=0;j<=i;j++)
          {
             k.add(arr[i][j]);
          }
          arr1.add(k);
       }
       return arr1;
    }
}