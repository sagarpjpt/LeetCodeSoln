/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
*/ 

class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        Stack<Integer> stack = new Stack<>();
        int index = nums.length -1;
        //copy k element from last to stack
        for(int i = 0;i < k;i++)
            stack.push(nums[index-i]);
        
        //shift all the non copied ele to end 
        for(int i = index-k;i >= 0;i--)
            nums[index--] = nums[i];

        //copy back k ele from stack to main array from index 0
        for(int i = 0;i < k;i++)
            nums[i] = stack.pop();
    }
}
