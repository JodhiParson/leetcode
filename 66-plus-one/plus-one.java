class Solution {
    public int[] plusOne(int[] digits) {
        //start from right of array
        for (int i = digits.length-1; i >= 0; i--) {
            // if digits < 9, add 1
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
            
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
    return digits;
        //if digits = 9, make new array with +1 length; make all elements 0 except index0
    }
}