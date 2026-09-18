class Solution {
    public boolean isLongPressedName(String name, String typed) 
    {  
        int t=0,t1=0; 
        if(name.length()>typed.length())
        return false;
        int i=0,l=0;
        while(i<name.length()-1&&l<typed.length())
        {
            char ch=name.charAt(i);
            char ch1=typed.charAt(l);
            if(ch==name.charAt(i+1))
            {
                i++;
                l++;
                continue;
            }
            if(ch!=ch1)
            return false;
            while(l<typed.length()&&name.charAt(i)==typed.charAt(l))
            l++;
            i++;
        }
         char ch=name.charAt(name.length()-1);
        if(l<typed.length())
        {    
            for(int i1=l;i1<typed.length();i1++)
            {
                if(ch!=typed.charAt(i1))
                return false;
            }
        }
        if(ch!=typed.charAt(typed.length()-1)||i!=name.length()-1)
        return false;
       return true;
    }
}