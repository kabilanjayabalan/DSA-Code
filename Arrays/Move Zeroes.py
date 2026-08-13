class Solution: #Leetcode : 283
    def moveZeroes(self, nums: List[int]) -> None:
        ins=0
        for i in range(len(nums)):
            if nums[i]!=0:
                nums[ins]=nums[i]
                ins+=1

        while ins<len(nums):
            nums[ins]=0
            ins+=1

        return nums
