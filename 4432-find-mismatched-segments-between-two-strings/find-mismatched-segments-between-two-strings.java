class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {

       List<List<String>> str=new ArrayList<>();
       List<String> str1=new ArrayList<>();
       String a="";
       String b="";
       for(int i=0;i<s1.length();i++)
       {
          if(s1.charAt(i)!=s2.charAt(i))
          {
             a+=s1.charAt(i);
             b+=s2.charAt(i);
          }
          else
          { 
             if(a.length()>0)
             {
                ArrayList<String> st=new ArrayList<>();
                st.add(a);
                st.add(b);
                str.add(new ArrayList<>(st));
                a="";
                b="";
             }
          }
       } 
       if(a.length()>0)
       {
          ArrayList<String> st=new ArrayList<>();
                st.add(a);
                st.add(b);
                str.add(new ArrayList<>(st));
       }
       return str;
    }
}