class Solution {
    public String replaceWords(List<String> dic, String sen) {
        String[] arr=sen.split(" ");
         for(int i=0;i<dic.size();i++)
         {
            String st=dic.get(i);
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j].startsWith(st))
                {
                    arr[j]=st;
                }
            }
         }
         StringBuilder str=new StringBuilder();
         for(int i=0;i<arr.length;i++)
         {
            str.append(arr[i]);
            str.append(" ");
         }
         return str.toString().trim();
    }
}