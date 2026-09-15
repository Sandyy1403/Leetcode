class Solution {
    public double minimumAverage(int[] nums) {
      Arrays.sort(nums);
      int n=nums.length/2;
      int t=0;
      double min=(double)Integer.MAX_VALUE;
      int i=0;
      int t1=nums.length-1;
      while(t!=n)
      {
          double t2=(double)nums[i];
          double t3=(double)nums[t1];
          min=Math.min((double)(t3+t2)/2,min);
          t++;
          t1--;
          i++;

      }
      return min;
    }
}