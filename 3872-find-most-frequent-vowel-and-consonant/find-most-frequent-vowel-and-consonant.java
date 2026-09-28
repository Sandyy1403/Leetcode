class Solution {
    public int maxFreqSum(String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        int max=0,max1=0;
        for(int i=0;i<26;i++)
        {
            if(i==0||i==4||i==8||i==14||i==20)
            {
                max=Math.max(freq[i],max);
            }
            else
            {
                max1=Math.max(freq[i],max1);
            }
        }
        return max+max1;
    }
}