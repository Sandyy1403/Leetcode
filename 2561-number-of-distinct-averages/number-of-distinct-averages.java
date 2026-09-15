class Solution {
    public int distinctAverages(int[] nums) {
        
        Arrays.sort(nums);
        int i=0;
        int l=nums.length-1;
        HashSet<Double> arr=new HashSet<>();
        while(i<=l)
        {
            double n=(double)nums[i];
            double n1=(double)nums[l];
            double t=(double)(n+n1)/2;
            arr.add(t);
            if(n==n1)
             i++;
            else
            {
                i++;
                l--;
            }
        }
        return arr.size();
    }
}