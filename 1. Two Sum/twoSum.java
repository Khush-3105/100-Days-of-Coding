class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
                if (nums[nums.length - 1 - i] + nums[nums.length - 1 - j] == target) {
                    res[0] = nums.length - 1 - i;
                    res[1] = nums.length - 1 - j;
                    return res;
                }
            }
        }
        return null;
    }
}