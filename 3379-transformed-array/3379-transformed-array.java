class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                res[i]=nums[i];
            }
            else if(nums[i]>0){
                int ind=(i+nums[i])%nums.length;
                res[i]=nums[ind];
            }else{
                int ind = (i + nums[i]) % nums.length;
                if (ind < 0) ind += nums.length;
                res[i] = nums[ind];
            }
        }
        return res;
    }
}


