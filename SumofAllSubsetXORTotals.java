/*
The XOR total of an array is defined as the bitwise XOR of all its elements, or 0 if the array is empty.

For example, the XOR total of the array [2,5,6] is 2 XOR 5 XOR 6 = 1.
Given an array nums, return the sum of all XOR totals for every subset of nums. 

Note: Subsets with the same elements should be counted multiple times.

An array a is a subset of an array b if a can be obtained from b by deleting some (possibly zero) elements of b.

Example 1:

Input: nums = [1,3]
Output: 6
Explanation: The 4 subsets of [1,3] are:
- The empty subset has an XOR total of 0.
- [1] has an XOR total of 1.
- [3] has an XOR total of 3.
- [1,3] has an XOR total of 1 XOR 3 = 2.
0 + 1 + 3 + 2 = 6
*/ 

class Solution {
    public int subsetXORSum(int[] nums) {
        // using recusrion traversing whole array for each subset
        /*
                nums[i]
                  /\
                 /  \
            present  absent
        */ 

        return helper(nums, 0, 0);
    }

    private int helper(int[] nums, int index, int currXOR){
        if(index == nums.length)
            return currXOR;

        int present = helper(nums, index+1, currXOR ^ nums[index]);

        int absent = helper(nums, index+1, currXOR);

        return present + absent;
    }
}
