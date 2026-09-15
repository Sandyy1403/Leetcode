class Solution {
    public String restoreString(String s, int[] in) {
        
        char[] arr=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            arr[in[i]]=s.charAt(i);
        }
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            s1.append(arr[i]);
        }
        return s1.toString();
    }
}