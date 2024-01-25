class Solution {
    public int maxArea(int[] height) {
        int left = 0; // left pointer; start of container
        int right = height.length - 1; // end of container
        int maxArea = 0; // max area found
        while (left < right) { // while pointers haven't crossed each other
        //find minimum height between left and right
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea); //compare max with current, if max > current, max = max else max = current;

            if (height[left] < height[right]) { // move pointers inward
                left++;
            } else {
                right--;
            }  //repeat until pointers meet, indicating all possibilities met
        }
        return maxArea; //largest maxArea will be returned;
    }
}