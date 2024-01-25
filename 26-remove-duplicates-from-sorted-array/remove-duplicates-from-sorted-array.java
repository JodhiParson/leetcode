class Solution {
    public int removeDuplicates(int[] nums) {
        //two pointers
        int k = 1; // keep track of index where unique element is placed; initial value is 1 since the first element is always unique
        for (int i = 1; i < nums.length; i++) { //need to check 1st index first bc 0th index is always unique.
            if (nums[i] != nums[i-1]) { //if unique
                nums[k] = nums[i]; //update nums[j] to the unique element
                k++; //mark next position for new unique element
            } 
        }
        return k; //return length of array w dupes removed
    }
}