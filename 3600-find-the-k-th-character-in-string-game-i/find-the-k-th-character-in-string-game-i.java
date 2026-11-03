class Solution {
    public char kthCharacter(int k) {
        StringBuilder str=new StringBuilder("a");
        while(str.length()<k)
        {  
            StringBuilder str1=new StringBuilder();
            for(int i=0;i<str.length();i++)
            {   
                if(str.charAt(i)=='z')
                {
                    str1.append((char)'a');
                    continue;
                }
                str1.append((char)(str.charAt(i)+1));
                 
            }
            str.append(str1); 
        }
        return str.charAt(k-1);
    }
}