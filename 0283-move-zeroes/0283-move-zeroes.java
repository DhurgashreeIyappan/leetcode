class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1) return;
        int left=0;
        while(left<nums.length && nums[left]!=0){
            left++;
        }
        int right=left+1;
        for(int i=right;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[left];
                nums[left]=nums[i];
                nums[i]=temp;
                left++;
            }
        }
    }
}