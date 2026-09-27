class Solution {
    public String reverseParentheses(String s) {
       
       Stack<Character> stk=new Stack<>(); 
       for(int i=0;i<s.length();i++)
       {  
          char ch=s.charAt(i);
          if(ch==')')
          {     
                StringBuilder str=new StringBuilder();
                while(!stk.isEmpty()&&stk.peek()!='(')
                {
                    str.append(stk.pop());
                }
                stk.pop();
                for(int i1=0;i1<str.length();i1++)
                {
                    stk.push(str.charAt(i1));
                }
          }
          else
          {
               stk.push(ch);
          }     
       }
       StringBuilder str=new StringBuilder();
       while(!stk.isEmpty())
       {
           str.append(stk.pop());
       }
       return str.reverse().toString();
    }
}