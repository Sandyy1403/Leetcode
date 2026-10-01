class Solution {
    public char[][] rotateTheBox(char[][] box) {
        

        for(int i=0;i<box.length;i++)
        {   ArrayList<Integer> arr=new ArrayList<>();
            int t=0;
            for(int j=0;j<box[i].length;j++)
            {
                
                if(box[i][j]=='#')
                {
                    arr.add(2);
                }
                else if(box[i][j]=='*')
                {
                    
                    Collections.sort(arr);
                    int t1=0;
                    for(int j1=0;j1<arr.size();j1++)
                    {    
                        int x=arr.get(j1);
                        if(x==1)
                          box[i][t]='.';
                        else if(x==2)
                           box[i][t]='#';
                        else
                           box[i][t]='*';
                        t++;
                    }
                    arr.clear();
                    t=j+1;
                }
                else
                {
                    arr.add(1);
                }
            }
             if(arr.size()>0)
              {
                    Collections.sort(arr);
                    for(int i1=0;i1<arr.size();i1++)
                    {    
                        int x=arr.get(i1);
                        if(x==1)
                           box[i][i1+t]='.';
                        else if(x==2)
                           box[i][i1+t]='#';
                        else
                           box[i][i1+t]='*';
                    }
              }   
        }
        int row=box[0].length;
        int col=box.length;
        char[][] box1=new char[row][col];
        for(int i=0;i<row;i++)
        {  int k=0;
            for(int j=col-1;j>=0;j--)
            {
                box1[i][k]=box[j][i];
                k++;
            }
        }
        return box1;
    }
}