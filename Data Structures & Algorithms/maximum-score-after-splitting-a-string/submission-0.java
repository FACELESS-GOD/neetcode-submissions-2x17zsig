class Solution {
    public int maxScore(String s) {
        int len = s.length() ; 
        int[] lz = new int[len];
        int[] rz = new int[len];
        int count = 0 ; 
        for(int i = 0 ; i<len ; i++)
        {
            char curr = s.charAt(i);
            lz[i] = count ;  
            if(curr == '0')
            {count = count + 1;}
            
        }

        count = 0 ; 
        for(int i = len-1 ; i>=0 ; i--)
        {
            char curr = s.charAt(i);
            rz[i] = count ; 
            if(curr == '1')
            {count = count + 1;}
             
        }
        int max = Integer.MIN_VALUE ; 
        for(int i = 0 ; i<len ; i++)
        {
            count = 0 ; 
            if(i == 0)
            {
                for(int j = 1 ; j<len ; j++)
                {
                    if(s.charAt(j) == '1')
                    {count = count + 1 ;}
                }
                if(s.charAt(0) == 0)
                {count = count + 1; }
            }
            else if(i == len - 1)
            {
                for(int j = 0 ; j<len-1 ; j++)
                {
                    if(s.charAt(j) == '0')
                    {count = count + 1 ;}
                }
                if(s.charAt(len-1) == 1)
                {count = count + 1; }
            }
            else
            {
                char curr = s.charAt(i);
                if(curr == '0')
                {
                    int left = 0 ; 
                    for(int j = 0; j<=i ; j++)
                    {
                        if(s.charAt(j) == '0')
                        {left = left + 1 ; }
                    }
                    int right = 0; 
                    for(int j = i+1; j<len ; j++)
                    {
                        if(s.charAt(j) == '1')
                        {right = right + 1 ; }
                    }
                    count = left + right ; 
                }
                else
                {
                     int left = 0 ; 
                    for(int j = 0; j<i ; j++)
                    {
                        if(s.charAt(j) == '0')
                        {left = left + 1 ; }
                    }
                    int right = 0; 
                    for(int j = i; j<len ; j++)
                    {
                        if(s.charAt(j) == '1')
                        {right = right + 1 ; }
                    }
                    count = left + right ; 
                }
            }

            if(max < count)
            {max = count ; }
        }
        return max ; 
    }
}