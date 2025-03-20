/*
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
Example 1:
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
*/
class Solution {
    public int strStr(String haystack, String needle) {
        int j = 0;
        int n = needle.length();
        int h = haystack.length();
        for(int i = 0;i < h; i++){
            if(needle.charAt(j) == haystack.charAt(i))
                j++;
            else{
                i -= j;
                j = 0;
            }
            if(j == n) return i-j+1;
        }
        return -1;
    }
}
