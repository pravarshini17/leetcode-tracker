// Last updated: 7/9/2026, 10:10:00 AM
class Solution {
    public long getSum(int[] nums) {
        int n = nums.length;

        long[] pre = new long[n+1];
        for(int i = 0 ;i<n; i++)
            pre[i+1] = pre[i] + nums[i];

        long ans =0 ;
        for(int x : nums)ans = Math.max(ans,x);

        int[] d1 = new int[n];
        int l =0, r=-1;
        for(int i=0; i<n ;i++){
            int K = (i>r)?1:Math.min(d1[l+r-i],r-i+1);
            while(i-K>=0 && i+K<n && nums[i-K]== nums[i+K])K++;
            d1[i] = K;
            if(i+K-1>r){
                l=i-K+1;
                r=i+K-1;
            }
            int left = i-d1[i]+1;
            int right = i+d1[i]-1;
            ans = Math.max(ans,pre[right+1]-pre[left]);
        }
        int[]d2 = new int[n];
        l=0;
        r=-1;
        for(int i=0 ; i<n ; i++){
            int K = (i>r)?0 : Math.min(d2[l+r-i+1],r-i+1);
            while(i-K-1>=0 && i+K<n &&nums[i-K-1]== nums[i+K])K++;
            d2[i] = K ;
            if(i+K-1>r){
                l=i-K;
                r=i+K-1;
            }
            if(d2[i]>0){
                int left = i-d2[i];
                int right = i+d2[i]-1;
                ans= Math.max(ans,pre[right+1]-pre[left]);
            }
        }
        return ans;
        
    }
}