class Solution {
    public int longestContinuousSubstring(String s) {
       
       int l=0;
       int max=0;
       int i=0;
       for(i=0;i<s.length()-1;i++)
       {  
          char ch=s.charAt(i); 
          if((char)(++ch)==s.charAt(i+1))
             continue;
          else
          {
            max=Math.max(max,(i-l)+1);
            l=i+1;
          }
       } 
       return Math.max(max,(i-l)+1);
    }
}