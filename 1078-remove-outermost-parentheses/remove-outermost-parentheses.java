class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str=new StringBuilder();
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++)
        {  
           char ch=s.charAt(i);
           if(stk.isEmpty())
           {
             stk.push('+');
           }
           else if(stk.peek()=='+' && ch==')')
           {
              stk.pop();
           }
           else
           {
              if(ch=='(')
              {
                 str.append(ch);
                 stk.push(ch);
              }
              else
              {
                str.append(ch);
                stk.pop();
              }
           } 
        }
        return str.toString();
    }
}