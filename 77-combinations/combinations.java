class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=i+1;
        }
        List<List<Integer>> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        int t1=0;
        int i=0;
        fun(i,k,arr,arr1,arr2);
        return arr1;
    }
    public void fun(int i,int k,int[] arr,List<List<Integer>> arr1,List<Integer> arr2)
    {
            if(arr2.size()==k||i==arr.length)
            {
                if(arr2.size()==k)
                {
                    arr1.add(new ArrayList(arr2)); 
                }
                return ;
            }
            arr2.add(arr[i]);
            fun(i+1,k,arr,arr1,arr2);
            arr2.remove(arr2.size()-1); 
            fun(i+1,k,arr,arr1,arr2);
    }
}