class Solution {
    public List<Integer> lexicalOrder(int n) {
        String[] arr=new String[n];
        ArrayList<Integer> str=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            arr[i-1]=String.valueOf(i);
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            str.add(Integer.parseInt(arr[i]));
        }
        return str;
    }
}