/*
Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
Example 1
Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.
*/ 
class Solution {
    public int thirdMax(int[] nums) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums)
            set.add(num);

        if(set.size() - 1 < 2){
            int i = Integer.MIN_VALUE;
            for(int ele : set){
                i = Math.max(i, ele);
            }
            return i;
        }

        for(int num : set){
            pq.add(num);
            if(pq.size() > 3) pq.poll();
        }

        return pq.poll();
    }
}
