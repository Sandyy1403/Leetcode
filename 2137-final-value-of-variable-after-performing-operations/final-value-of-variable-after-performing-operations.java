class Solution {
    public int finalValueAfterOperations(String[] oper) {
        
        int sum=0;
        for(String arr:oper)
        {
            if(arr.charAt(1)=='+')
              sum++;
            else
             sum--;
        }
        return sum;
    }
}