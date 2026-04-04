class NumArray {
    int [] arr ;
    HashMap<String, Integer> sum  ; 
    int len ; 
    public NumArray(int[] nums) {
        this.arr = nums ;
        this.len = nums.length ; 
        this.sum =  new HashMap<String, Integer>();
        for(int i = 0; i<this.len-1 ; i++)
        {
            for(int j = i + 1 ; j<this.len ; j++)
            {
                int count = 0 ; 
                for(int k = i ; k<=j ; k++)
                {
                    count = count + this.arr[k];
                }
                String key = String.valueOf(i) + "," + String.valueOf(j) ;
                sum.put(key, count);

            }
        } 

    }
    
    public int sumRange(int left, int right) {
        if(left == right)
        {return this.arr[left];}
        else
        {
            String key =  String.valueOf(left) + "," + String.valueOf(right) ;
            return sum.get(key);
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */