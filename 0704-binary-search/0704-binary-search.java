class Solution {
    public int bs(int s,int e,int[] nums,int target){
        if(s>e) return -1;
        int mid=(s+e)/2;
        if(nums[mid]==target) return mid;
        else if(target>nums[mid]) return bs(mid+1,e,nums,target);
        else return bs(s,mid-1,nums,target);
    }
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int ans=bs(s,e,nums,target);
        return ans;
    }
}