class Solution {
    public String compressedString(String word) {
        
        StringBuilder str=new StringBuilder();
        for(int i=0;i<word.length();)
        {   
            char ch=word.charAt(i);
            int t=0;
            while(i<word.length()&&word.charAt(i)==ch)
            {
                t++;
                i++;
                if(t==9)
                {
                    break;
                }
            }
            String ch1=String.valueOf(t);
            str.append(ch1);
            str.append(ch);
        }
        return str.toString();
    }
}