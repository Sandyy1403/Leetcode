class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> arr=new ArrayList<>();
        int t=0;
        int n=candidates.length;
        ArrayList<Integer> arr1=new ArrayList<>(); 
        fun(t,candidates,target,arr,arr1);
        return arr;
    }
    public void fun(int t,int[] candidates,int target,List<List<Integer>> arr,List<Integer> arr1)
    {
        if(t==candidates.length||target==0)
        {
            if(target==0)
              arr.add(new ArrayList(arr1));
            return;
        }
        if(candidates[t]<=target)
        {
            arr1.add(candidates[t]); 
            fun(t,candidates,target-candidates[t],arr,arr1);
            arr1.remove(arr1.size()-1);
        }
        fun(t+1,candidates,target,arr,arr1);
    }
    
}