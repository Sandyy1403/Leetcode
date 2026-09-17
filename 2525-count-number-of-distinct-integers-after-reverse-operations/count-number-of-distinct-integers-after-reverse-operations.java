class Solution {
    public int countDistinctIntegers(int[] nums) {
        int[] arr =new int[(nums.length*2)];
        int t=0;
        for(int i=0;i<nums.length;i++)
        {
            String s=String.valueOf(nums[i]);
            arr[t++]= nums[i];
            StringBuilder st=new StringBuilder(s);
            st.reverse();
            String s1=st.toString();
            int t1=Integer.parseInt(s1);
            arr[t++]=t1;
        }
        HashSet<Integer> str=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            str.add(arr[i]);
        }
        return str.size();
    }
}