class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n= nums.length;
        int[] pf=new int[n];
        int[]sf = new int[n];
        int[]ans =new int[n];
        pf[0]=nums[0];
        for(int i=1;i<n;i++){
            pf[i]=pf[i-1]+nums[i];
        }
        sf[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            sf[i]=sf[i+1]+nums[i];
        }
        int ls,rs;
        for(int i=0;i<n;i++){
            if(i==0) ls=0;
            else ls=pf[i-1];
            if(i==n-1) rs=0;
            else rs=sf[i+1];
            ans[i]=Math.abs(ls-rs);
        }
        return ans;
        
    }
}