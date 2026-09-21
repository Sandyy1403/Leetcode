class Solution {
    public int countGoodSubstrings(String s) {
        
         //String[] arr=new String[s.length()/3];
         int c=0;
         for(int i=0;i<s.length()-2;i++)
         {
             char ch=s.charAt(i);
             char ch1=s.charAt(i+1);
             char ch2=s.charAt(i+2);
             if(ch!=ch1&&ch1!=ch2&&ch2!=ch&&ch2!=ch1)
             c++;

         }
         return c;
    }
}