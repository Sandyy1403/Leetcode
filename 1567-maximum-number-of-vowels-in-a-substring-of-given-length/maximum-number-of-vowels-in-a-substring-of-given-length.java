class Solution {
    public int maxVowels(String s, int k) {
        
        int t=0;
        for(int i=0;i<k;i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                t++;
            }

        }
        int max=t;
        int t1=0;
        for(int i=k;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                t++;
            }
            char ch1=s.charAt(t1);
            if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
            {
                t--;
            }
            max=Math.max(max,t);
            t1++;
        }
        return max;
    }
}