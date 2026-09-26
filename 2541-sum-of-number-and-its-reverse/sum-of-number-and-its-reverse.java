class Solution {
    public boolean sumOfNumberAndReverse(int num) {

       for(int i=0;i<=num;i++)
       {  
          StringBuilder arr=new StringBuilder(String.valueOf(i)); 
          int temp=Integer.parseInt(arr.reverse().toString());
          if(i+temp==num)
           return true;
       } 
       return false;
    }
}