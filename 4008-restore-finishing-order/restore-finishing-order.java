class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<friends.length;i++)
        {
            arr.add(friends[i]);
        }
        int[] arr1=new int[friends.length];
        int t=0;
        for(int i=0;i<order.length;i++)
        {
            if(arr.contains(order[i]))
            {
                arr1[t]=order[i];
                t++;
            }
        }
        return arr1;
    }
}