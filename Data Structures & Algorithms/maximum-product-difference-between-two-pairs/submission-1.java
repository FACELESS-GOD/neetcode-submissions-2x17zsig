class Solution {
    public int maxProductDifference(int[] nums) {
        int len = nums.length ; 
        Arrays.sort(nums);
        int a = nums[len-1];
        int b = nums[len-2];
        int c = nums[0];
        int d = nums[1];
        return (a * b) - (c * d) ; 
    }
}