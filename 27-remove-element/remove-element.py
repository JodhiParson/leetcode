class Solution(object):
    def removeElement(self, nums, val):
        k = 0

        for i in range(len(nums)):
            if nums[i] != val:
                #partition (quick sort/ quick select)  
                nums[k] = nums[i]
                k += 1
        return k

        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        