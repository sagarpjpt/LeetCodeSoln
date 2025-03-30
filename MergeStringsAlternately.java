/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
*/

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int ind1 = 0, ind2 = 0;
        String res = "";
        while(ind1 < len1 && ind2 < len2){
            if(res.length() % 2 == 0){
                res += word1.charAt(ind1);
                ind1++;
            }
            else{
                res += word2.charAt(ind2);
                ind2++;
            }
        }
        if(ind1 < len1 && ind2 >= len2)
            res += word1.substring(ind1, word1.length());
        if(ind1 >= len1 && ind2 < len2)
            res += word2.substring(ind2, word2.length());   
    
        return res;
    }
}
