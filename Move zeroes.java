class Solution {
    public void moveZeroes(int[] nums) {
        int pos = 0;

        for (int x : nums) {
            if (x != 0) {
                nums[pos] = x;
                pos++;
            }
        }

        while (pos < nums.length) {
            nums[pos] = 0;
            pos++;
        }
    }
}
