class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>ans = new ArrayList<Integer>();
        
        List<Integer>prev = new ArrayList<Integer>();
        if(rowIndex == 0)
        {
            ans.add(1);            
            return ans ;
        }
        else if (rowIndex == 1)
        {
            ans.add(1);
            ans.add(1);
            return ans ; 
        }
        prev.add(1);
        prev.add(1);
        
        for(int j = 2 ; j<=rowIndex ; j++)
        {
            List<Integer> temp = new ArrayList<Integer>();
            if(j == 2)
            {
                temp.add(1);
                temp.add(2);
                temp.add(1);
            }
            else
            {
                temp.add(1);
                for(int i = 1 ; i<=prev.size()-1 ; i++)
                {
                    if(i == prev.size() - 1)
                    {
                        int curr = prev.get(i-1);
                        curr = curr + 1 ; 
                        temp.add(curr);
                    }
                    else
                    {
                        int first = prev.get(i-1);
                        int second = prev.get(i);
                        int curr = first  + second ; 
                        temp.add(curr);
                    }                
                }
                
                temp.add(1);
            }
            prev.clear();
            prev.addAll(temp);
        }
        return prev ; 
    }
}