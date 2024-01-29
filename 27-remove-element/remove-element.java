//when removing the elements that stayed are at the beginning and the removed values are at the end
class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i< nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}