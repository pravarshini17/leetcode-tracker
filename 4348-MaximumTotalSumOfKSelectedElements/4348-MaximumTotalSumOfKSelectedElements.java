// Last updated: 7/9/2026, 10:09:55 AM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
      Arrays.sort(nums);
        long ans = 0;
        int currentMul = mul;
        for(int i = nums.length - 1; i>=nums.length - k; i--){
            if (currentMul > 1){
                ans += 1L *nums[i] * currentMul;
            }else {
                ans += nums[i];
            }
            currentMul--;
        }
        return ans;
    }
}