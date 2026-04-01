class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0 ;
        int len = flowerbed.length ;
        if(len == 1 )
        {
            if(flowerbed[0] == 1)
            {
                if(n == 0)
                {return true ; }
                else
                {return false ; }
            }
            else
            {
                if(n <= 1)
                {return true ; }
                else
                {return false ; }
            }
        }
        if(len == 2)
        {
            if(flowerbed[0] == 0 && flowerbed[1] == 0)
            {
                if(n<=1)
                {return true ; }
                else
                {return false ; }
            }
            else
            {
                if(n==0)
                {return true ; }
                else
                {return false ; }
            }
        }
        if(len == 3)
        {
            if(
                (
                    flowerbed[0] == 0 &&
                    flowerbed[1] == 0 &&
                    flowerbed[2] == 1
                ) || 
                (
                    flowerbed[0] == 1 &&
                    flowerbed[1] == 0 &&
                    flowerbed[2] == 0
                )
            )
            {
                if(n<=1)
                {return true ; }
                else
                {return false ; } 
            }
            else
            {
                if(n==0)
                {return true ; }
                else
                {return false ; }
            }
        } 
        boolean [] isPlanted = new boolean[len];
        for(int i = 1; i<len-1 ; i++)
        {
            System.out.println(i+" "+flowerbed[i-1]+" "+flowerbed[i]+" "+flowerbed[i+1]+" ");
            if(i == 1) 
            {
                if(flowerbed[i] == 0 && flowerbed[i+1] == 1 && flowerbed[i-1] == 0)
                {
                    count = count + 1 ;
                    flowerbed[i-1] = 1;
                }
            }
            else if(i == len-2) 
            {
                if(flowerbed[i] == 0 && flowerbed[i+1] == 0 )
                {
                    count = count + 1 ;
                    flowerbed[i+1] = 1;
                }
            }
            else if(flowerbed[i] == 0 && flowerbed[i+1] == 0 && flowerbed[i-1] == 0 )
            {
                count = count  +  1 ;
                flowerbed[i] = 1 ;

            }
        } 
        System.out.println(count + " " + n);
        if(count >= n)
        {return true ; }
        return false ; 
    }
}