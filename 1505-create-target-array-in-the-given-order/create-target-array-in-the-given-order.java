class Solution {
    public void swap(int[] arr, int t,int end)
    {
        for(int i=end-1;i>t;i--)
        {
            arr[i]=arr[i-1];
        }
    }
    public int[] createTargetArray(int[] nums, int[] index) {
       int[] arr=new int[nums.length];
       Arrays.fill(arr,-1);
       for(int i=0;i<nums.length;i++)
       {  
         if(arr[index[i]]==-1)
          arr[index[i]]=nums[i];
         else
         {
            swap(arr,index[i],index.length);
            arr[index[i]]=nums[i];
         }
       } 
       return arr;
    }
}