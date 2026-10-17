class Solution {
    public String[] findWords(String[] words) 
    {
        HashMap<Integer,String> arr=new HashMap<>();
         ArrayList<String> arr1=new ArrayList<>();
        arr.put(1,"asdfghjkl");
        arr.put(2,"qwertyuiop");
        arr.put(3,"zxcvbnm");
        for(int i=0;i<words.length;i++)
        {  
            String str1=words[i];
            for(int i2=1;i2<4;i2++)
            {
                String str=arr.get(i2);
                char ch=Character.toLowerCase(str1.charAt(0));
                if(str.contains(String.valueOf(ch)))
                {   
                    int f=0;
                    for(int i1=0;i1<str1.length();i1++)
                    {
                        char ch1=Character.toLowerCase(str1.charAt(i1));
                        if(!str.contains(String.valueOf(ch1)))
                        {
                            f=1;
                            break;
                        }
                    }
                    if(f==0)
                    {
                        arr1.add(str1);
                    }
                    break;
                }
            }
        }
       String[] str=new String[arr1.size()];
       for(int i=0;i<arr1.size();i++)
          str[i]=arr1.get(i);
        return str;
    }
}