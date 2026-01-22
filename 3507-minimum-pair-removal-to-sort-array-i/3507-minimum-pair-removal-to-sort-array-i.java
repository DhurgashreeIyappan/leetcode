class Solution {
    public int minimumPairRemoval(int[] nums) {
        int operations = 0;

        while (!isSorted(nums)) {
            int n = nums.length;
            int minSum = Integer.MAX_VALUE;
            int index = 0;

            for (int i = 1; i < n; i++) {
                int sum = nums[i - 1] + nums[i];
                if (sum < minSum) {
                    minSum = sum;
                    index = i - 1;
                }
            }
            int[] newNums = new int[n - 1];
            int j = 0;

            for (int i = 0; i < n; i++) {
                if (i == index) {
                    newNums[j++] = minSum;
                    i++; 
                } else {
                    newNums[j++] = nums[i];
                }
            }

            nums = newNums;
            operations++;
        }

        return operations;
    }

    private boolean isSorted(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                return false;
            }
        }
        return true;
    }
}
