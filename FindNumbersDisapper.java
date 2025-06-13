/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
*/ 
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int count[] = new int[n+1];
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            count[num]++;
        }
        for(int i = 1;i <= n;i++){
            if(count[i] == 0)
                list.add(i);
        }

        return list;
    }
}
