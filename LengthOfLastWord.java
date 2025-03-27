/*
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
*/

class Solution {
    public int lengthOfLastWord(String s) {
        int i = 0;
        int alpha_encountered_from_last = 0;
        for(i = s.length()-1; i >= 0; i--){
            if(alpha_encountered_from_last == 0 && s.charAt(i) == ' ')
                continue;
            alpha_encountered_from_last++;
            if(s.charAt(i)  == ' ') break;
        }   
        if(i < 0)   //dry run for [w o r d _ _ _] u will know why this condn 
            return alpha_encountered_from_last;
        else
            return --alpha_encountered_from_last;
    }
}
