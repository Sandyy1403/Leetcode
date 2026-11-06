class Solution {
    public boolean lemonadeChange(int[] bills) {
        List<Integer> arr5=new ArrayList<>();
        List<Integer> arr10=new ArrayList<>(); 
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
              arr5.add(5);
            else if(bills[i]==10)
            {
                if(arr5.contains(5))
                {
                    arr5.remove(arr5.size()-1);
                    arr10.add(10);
                }
                else
                {
                    return false;
                }
            }
            else if(bills[i]==20)
            {
                if(arr5.contains(5)&&arr10.contains(10))
                {
                    arr5.remove(arr5.size()-1);
                    arr10.remove(arr10.size()-1);
                }
                else if(arr5.size()>=3)
                {
                    arr5.remove(arr5.size()-1);
                    arr5.remove(arr5.size()-1);
                    arr5.remove(arr5.size()-1);
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
}