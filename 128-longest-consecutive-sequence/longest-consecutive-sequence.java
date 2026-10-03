class Solution {
    public int longestConsecutive(int[] nums) {
        
        Arrays.sort(nums);
        int t=1;
        if(nums.length<1)
          return 0;
          int t1=0;
        for(int i=0;i<nums.length-1;i++)
        {   
            if((nums[i+1]==nums[i]))
              continue;
            if((nums[i+1]-nums[i])==1)
               t++;
             else
             {
                t1=Math.max(t,t1);
                t=1;
             }
        }
        return Math.max(t1,t);
    }
}