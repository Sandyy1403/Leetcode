class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int[] freq=new int[26];
        int[] freq1=new int[26];
        int t1=0;
        for(int i=0;i<s.length();i++)
        {
             char ch=s.charAt(i);
             int f=0;
             for(int j=t1;j<t.length();j++)
             {
                if(ch==t.charAt(j))
                {
                    f=1;
                    t1=j+1;
                    break;
                }
             }
             if(f==0)
             return false;
        }
        return true;
    }
}