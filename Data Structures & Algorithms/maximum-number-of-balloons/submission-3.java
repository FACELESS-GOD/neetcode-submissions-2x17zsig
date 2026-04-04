class Solution {
    public int maxNumberOfBalloons(String text) {
        int len = text.length() ; 
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i<len ; i++)
        {
            char curr = text.charAt(i);
            if(map.containsKey(curr) != true)
            {
                map.put(curr, 1) ;
            }
            else
            {
                int val = map.get(curr);
                val = val + 1; 
                map.put(curr, val);
            }
        }
        if( map.containsKey('b') == true && 
            map.containsKey('a') == true &&
            map.containsKey('l') == true &&
            map.containsKey('o') == true &&
            map.containsKey('n') == true )
        {
            int b = map.get('b');
            int a = map.get('a');
            int c = map.get('n');

            int base = 0 ; 

            if(b  > a)
            {
                if(c > a)
                {base = a ; }
                else
                {
                    base = c; 
                }
            }
            else
            {
                if(c > b)
                {base = b ; }
                else
                {
                    base = c; 
                }
            }

            int fact = 0 ; 
            int o = map.get('o');
            int l = map.get('l');

            if(o > l)
            {fact =  l ; }
            else
            {fact = o ;}
            int ans = 0 ; 

            for(int i = 0 ; i<=base ; i++)
            {
                int max = i*2 ; 
                if(max <= fact )
                {ans = i ; }
            }
            return ans ; 
        }
        else
        {
            return 0 ; 
        }
    }
}