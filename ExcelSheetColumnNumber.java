/*
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
Example 1:
Input: columnTitle = "A"
Output: 1
Example 2:
Input: columnTitle = "AB"
Output: 28
Example 3:
Input: columnTitle = "ZY"
Output: 701
*/ 
class Solution {
    public int titleToNumber(String columnTitle) {
        int res = 0;

        for(int i = 0;i < columnTitle.length();i++){
            char ch = columnTitle.charAt(i);
            int value = ch - 'A' + 1;
            res = res * 26 + value;
        }
        return res;
    }
}
