class Solution {
    public int digitFrequencyScore(int n) {
        int[] freq=new int[10];
        while(n>0)
        {
            int b=n%10;
            n /=10;
            freq[b]++;
        }
        int sum=0;
        for(int i=0;i<10;i++)
        {
            sum +=(freq[i]*i);
        }
        return sum;
    }
}