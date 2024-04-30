class Solution {
    public int[] shuffle(int[] nums, int n) {
       int [] shuffled_array=new int[nums.length];
        for(int i=0;i<n;i++){
            shuffled_array[2*i]=nums[i];
            shuffled_array[2*i+1]=nums[i+n];
        }
        return shuffled_array; 
    }
}