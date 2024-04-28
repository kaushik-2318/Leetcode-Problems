class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        int n=nums.length;
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
        }
        for(int i=n;i<(n+n);i++){
            ans[i]=nums[i-n];
        }
        return ans;
    }
}