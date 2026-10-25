class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> arr=new ArrayList<>();
        ArrayList<Integer> arr1=new ArrayList<>();
        int i=0;
        fun(i,arr,arr1,nums);
        return arr;
    }
    public void fun(int i,List<List<Integer>> arr,List<Integer> arr1,int[] nums)
    {
        if(i==nums.length)
        {
            arr.add(new ArrayList(arr1));
            return ;
        }
        arr1.add(nums[i]);
        fun(i+1,arr,arr1,nums);
        arr1.remove(arr1.size()-1);
        fun(i+1,arr,arr1,nums);

    }
}