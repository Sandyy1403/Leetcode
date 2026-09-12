class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] arr=new int[nums.length];
        int l=0;
        int t=0;
        for(int i=n;i<nums.length;i++)
        {
           arr[l]=nums[t];
           l++;
           arr[l]=nums[i];
           l++;
           t++;
        }
        return arr;
    }
}