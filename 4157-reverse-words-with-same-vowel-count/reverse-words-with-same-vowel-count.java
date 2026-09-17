class Solution {
    public String reverseWords(String s) {
        
        String[] arr=s.split(" ");
        int t=0;
        for(int i=0;i<arr[0].length();i++)
        {
            char ch=arr[0].charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                t++;
            }
        }
        for(int i=1;i<arr.length;i++)
        {
            String s1=arr[i];
            int t1=0;
            for(int j=0;j<s1.length();j++)
            {   
                char ch=s1.charAt(j);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
               {
                  t1++;
               }
            }
            if(t==t1)
            {
                StringBuilder st=new StringBuilder(s1);
                st.reverse();
                arr[i] = st.toString();
            }
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            str.append(arr[i]+" ");
        }
        return str.toString().trim();
    }
}