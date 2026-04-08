class Solution {
    public boolean isPathCrossing(String path) {
        int len = path.length();
        HashMap<String, Integer>map = new HashMap<String ,Integer>();
        String currentPosition = "0,0";
        map.put(currentPosition, 1);
        int i = 0 , j = 0;
        for(int k = 0 ; k<len ; k++)
        {
            char curr = path.charAt(k);
            switch(curr)
            {
                case 'N' :
                    i = i - 1 ; 
                    String newPosition = Integer.toString(i)+","+Integer.toString(j);
                    if(map.containsKey(newPosition) == true)
                    {return true ; }
                    else
                    {map.put(newPosition, 1);}
                    break;
                    
                case 'S' :
                    i = i + 1 ; 
                    String newPosition1 = Integer.toString(i)+","+Integer.toString(j);
                    if(map.containsKey(newPosition1) == true)
                    {return true ; }
                    else
                    {map.put(newPosition1, 1);}
                    
                    break;
                    
                case 'E' :
                    j = j + 1 ; 
                    String newPosition2 = Integer.toString(i)+","+Integer.toString(j);
                    if(map.containsKey(newPosition2) == true)
                    {return true ; }
                    else
                    {map.put(newPosition2, 1);}
                    
                    break;
                    
                case 'W' :
                    j = j - 1 ; 
                    String newPosition3 = Integer.toString(i)+","+Integer.toString(j);
                    if(map.containsKey(newPosition3) == true)
                    {return true ; }
                    else
                    {map.put(newPosition3, 1);}
                    
                    break;
            }
            
        } 
        return false ; 



        
    }
}