class Solution {
    public int maxProfit(int[] prices) {
        Stack<Integer> stk=new Stack<>();
        stk.push(prices[prices.length-1]);
        for(int i=prices.length-2;i>=0;i--)
        {
            if(stk.peek()<=prices[i])
              stk.push(prices[i]);
        }
        int max=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<stk.peek())
            {
                max=Math.max(stk.peek()-prices[i],max);
            }
            if(prices[i]==stk.peek())
              stk.pop();
        }
        return max;
    }
}