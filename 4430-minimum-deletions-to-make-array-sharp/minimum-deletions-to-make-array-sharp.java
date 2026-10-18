class Solution {
    public int minDeletions(int[] nums) {
        
        int t=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if((nums[i]^nums[i+1])==0)
             t++;
        }
        return t;
    }
}