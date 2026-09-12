class Solution {
    public int triangularSum(int[] nums) {
       if(nums.length==1)
       return nums[0];
        int[][] arr=new int[nums.length][nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[0][i]=nums[i];
        } 
        int n=nums.length-1;
        for(int i=1;i<arr.length;i++)
        {
            for(int j=0;j<n;j++)
            {
                int n1=arr[i-1][j]+arr[i-1][j+1];
                if(n1>=10)
                {
                    arr[i][j]=n1%10;
                }
                else
                {
                    arr[i][j]=n1;
                }
            }
            n--;
            if(n==0)
            {
                return arr[i][0];
            }
        }
        return 0;
    }
}