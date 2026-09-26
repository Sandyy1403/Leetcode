class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        
        HashMap<String,String> arr=new HashMap<>();
        for(int i=0;i<knowledge.size();i++)
        {
            ArrayList<String> arr1=new ArrayList<>(knowledge.get(i));
             arr.put(arr1.get(0),arr1.get(1));
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            StringBuilder str1=new StringBuilder();
            if(ch=='(')
            {  
                i++;
                while(i<s.length()&&s.charAt(i)!=')')
                {
                    str1.append(s.charAt(i));
                    i++;
                }
                String s1=str1.toString();
                if(arr.containsKey(s1))
                  str.append(arr.get(s1));
                else
                  str.append('?');
            }
            else
             str.append(ch);
        }
        return str.toString();
    }
}