class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            int ind = (i + nums[i]) % n;
            if (ind < 0) ind += n;
            res[i] = nums[ind];
        }

        return res;
    }
}
