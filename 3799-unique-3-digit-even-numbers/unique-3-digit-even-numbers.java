class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> arr=new HashSet<>();
        List<Integer> arr1=new ArrayList<>();
        int[] arr2=new int[digits.length];
        int t2=0;
        digits_arrange(t2,digits,arr,arr1,arr2);
        return arr.size();
    }
    public void   digits_arrange(int t2,int[] digits,HashSet<Integer> arr,List<Integer> arr1,int[] arr2)
    {
        if(arr1.size()==3||t2==digits.length)
        {    
            int t1=0;
            if(arr1.get(2)%2==0)
            {
                for(int i=0;i<3;i++)
                   t1=(t1*10)+arr1.get(i); 
                if(t1>=100)
                {
                  if(!arr.contains(t1))
                  {
                    arr.add(t1);
                  } 
                }
            }
            return ;
        }
        for(int i=0;i<digits.length;i++)
        { 
          if(arr2[i]==0)
          {  
             arr2[i]=1;
             arr1.add(digits[i]);
             digits_arrange(t2+1,digits,arr,arr1,arr2);
             arr1.remove(arr1.size()-1);
             arr2[i]=0;
          }
           
        } 
    }
}