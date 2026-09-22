class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stk=new Stack<>();
        //Stack<Integer> arr=new Stack<>();
        int n=0;
        int n1=0;
        while(n<pushed.length&&n1<popped.length)
        {  
                stk.push(pushed[n]);
                n++;
            if(!stk.isEmpty()&&popped[n1]==stk.peek())
            {
              while(!stk.isEmpty()&&popped[n1]==stk.peek())
              {
                stk.pop();
                n1++;
              }
            }
        }
        if(stk.isEmpty())
        return true;
        return false;
    }
}