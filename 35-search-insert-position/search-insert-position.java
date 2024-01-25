class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null) {
            return -1;
        }
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == target || nums[i] > target) {
                return i;
             } else {
                i++;
            }
        }
        return i;
            }
        }
    
