/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/ 

class Solution {
    public int majorityElement(int[] nums) {
        int res = nums[0];
        int count = 1;
        for(int i = 1; i < nums.length;i++){
            if(res == nums[i])
                count++;
            // count = 0 means there exist a number which occured 
            // more times than the element in res so assign that to res and set count to 1 
            //ie count++
            else if(count == 0){
                res = nums[i];
                count++;
            }
            //when nums[i] not equal to element in res
            else
                count--;
        }
        return res;
    }
}
