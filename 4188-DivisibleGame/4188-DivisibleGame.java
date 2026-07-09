// Last updated: 7/9/2026, 10:10:01 AM
class Solution {
    public int divisibleGame(int[] nums) {
        int MOD = 1_000_000_007;
        int n = nums.length;
        HashSet<Integer>set = new HashSet<>();

        for(int x :nums){
            for(int d = 2; d * d<=x; d++){
                if(x % d==0){
                    set.add(d);
                    set.add(x/d);
                }
            }
            if(x>1)set.add(x);
        }
        set.add(2);
        long bestDiff = Long.MIN_VALUE;
        int bestK=2;
        for(int K : set){
            long cur = 0;
            long best = Long.MIN_VALUE;

            for(int x : nums){
                if(x%K==0)
                    cur += x;
                else
                    cur-=x;
                best = Math.max(best,cur);
                if(cur<0) cur=0;
            }
            if(best>bestDiff || (best == bestDiff && K<bestK)){
                bestDiff = best;
                bestK = K;
            }
        }
        long ans = (bestDiff % MOD)*bestK % MOD;
        ans = (ans+MOD)% MOD;

        return(int)ans;
    }
    }