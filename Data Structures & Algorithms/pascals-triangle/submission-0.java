class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        List<Integer>n1 = new ArrayList<Integer>();
        n1.add(1);
        ans.add(n1);

        List<Integer>n2 = new ArrayList<Integer>();
        n2.add(1);
        n2.add(1);
        
        if(numRows == 1)
        {
            return ans ;
        }
        else if(numRows == 2)
        {
            ans.add(n2);
            return ans ; 
        }
        
        ans.add(n2);
    
        for(int i = 2 ; i< numRows ; i++)
        {
            System.out.println(i);
            List<Integer>prev = ans.get(i-1);
            System.out.println("prev Size = "+prev.size());
            List<Integer> temp = new ArrayList<Integer>();
            temp.add(1);
            int secondLastIndex = prev.size() - 2 ; 
            System.out.println("second Last Index :  "+secondLastIndex);
            for(int j = 1 ; j<=prev.size()-2 ; j++)
            {
                System.out.println("k =  "+j);
                temp.add(prev.get(j) + prev.get(j-1));
            }
            int secondLast = prev.get(prev.size() - 2) ; 
            secondLast = secondLast + 1 ;  
            temp.add(secondLast);
            temp.add(1);
            ans.add(temp);
        }







        return ans ; 
    }
}