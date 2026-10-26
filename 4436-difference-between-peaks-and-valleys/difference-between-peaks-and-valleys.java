class Solution {
    public int peakValleyDifference(int[] nums) {
       
       int t=0;
       int t1=0;
       for(int i=1;i<nums.length-1;i++)
       {
          if(nums[i]>nums[i-1]&&nums[i]>nums[i+1])
             t+=nums[i];
          if(nums[i]<nums[i-1]&&nums[i]<nums[i+1])
             t1+=nums[i];
       } 
       return t-t1;
    }
}