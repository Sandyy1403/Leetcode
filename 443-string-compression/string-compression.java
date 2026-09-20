class Solution {
    public int compress(char[] chars) 
    {   
        int x=0;
        for(int i=0;i<chars.length;)
        { 
           char ch=chars[i];
           int t=0;
            while(i<chars.length&&chars[i]==ch)
            {
                t++;
                i++;
            }
            chars[x]=ch;
            x++;
            if(t>1)
            {
                String str=String.valueOf(t);
                for(int j=0;j<str.length();j++)
                {
                    chars[x]=str.charAt(j);
                    x++;
                }
            }
        }
        return x;
    }
}