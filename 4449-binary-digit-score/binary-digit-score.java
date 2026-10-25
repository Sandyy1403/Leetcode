class Solution {
    public int calculateScore(int a, int b) {
        int t=0;
        int t1=0;
        while(a>0)
        {
            int a1=a%2;
            if(a1==1)
             t++;
            a/=2;
        }
        while(b>0)
        {
            int a1=b%2;
            if(a1==1)
             t1++;
            b/=2;
        }
        return t>=t1?t1*t:t1/t;
    }
}