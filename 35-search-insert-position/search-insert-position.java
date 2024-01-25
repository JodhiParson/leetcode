class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0; //start of array
        int right = nums.length-1; //end of array
        while (left <= right) {
            int mid = left + (right-left)/2; //midpoint
            if (nums[mid] == target) { // if mid is the target, return mid
                return mid;
            }
            if (nums[mid] < target) { //if target is greater than mid
                left = mid + 1; //search the right half of the current range
            } else { //if target is less than mid
                right = mid -1; //search the left half of the current range
            }
        }
        return left;
            }
        }
    
