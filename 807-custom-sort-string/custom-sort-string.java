class Solution {
    public String customSortString(String order, String s) {
        
        HashSet<Character> arr=new HashSet<>();
        HashSet<Character> arr1=new HashSet<>();
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++)
        {
             arr.add(s.charAt(i));
             freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<order.length();i++)
        {
             arr1.add(order.charAt(i));
        }
         StringBuilder sc=new StringBuilder();
        for(int i=0;i<order.length();i++)
        {
            if(arr.contains(order.charAt(i)))
            {
              sc.append(order.charAt(i));
              arr.remove(order.charAt(i));
              if(freq[order.charAt(i)-'a']>1)
              {
                for(int j=1;j<freq[order.charAt(i)-'a'];j++)
                sc.append(order.charAt(i));
              }
            }
        }
        for(int i=0;i<s.length();i++)
        {
            if(arr.contains(s.charAt(i)))
             sc.append(s.charAt(i));
        }
        return sc.toString();
    }
}