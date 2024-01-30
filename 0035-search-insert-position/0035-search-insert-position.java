class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0, j = 0, a = -1;
        for (i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                a = i;
                break;
            }
        }
        if (a == -1) {
            if (target < nums[0]) {
                a = 0;
            } else {
                for (i = 0; i < nums.length; i++) {

                    if (target > nums[i]) {
                        a = i + 1;
                    }
                }
            }
        }
        return a;
    }
}