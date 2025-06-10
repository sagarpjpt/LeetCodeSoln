/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
*/ 
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> set1 = new HashMap<>();
        HashMap<Integer, Integer> set2 = new HashMap<>();

        List<Integer> res = new ArrayList<>();
        
        for(int num : nums1){
            if(set1.containsKey(num))
                set1.put(num, set1.get(num) + 1);
            else 
                set1.put(num, 1);
        }

        for(int num : nums2){
            if(set2.containsKey(num))
                set2.put(num, set2.get(num) + 1);
            else 
                set2.put(num, 1);
        }

        List<Integer> ele = new ArrayList<>(set1.keySet());

        for(int num : ele){
            if(set2.containsKey(num)){
                int count1 = set1.get(num);
                int count2 = set2.get(num);
                if(count1 == count2){
                    while(count1 > 0){
                        res.add(num);
                        count1--;
                    }
                }
                else{
                    int count = Math.min(count1, count2);
                    while(count > 0){
                        res.add(num);
                        count--;
                    }
                }
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
