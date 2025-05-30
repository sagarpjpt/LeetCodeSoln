/*
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...

Example 1:
Input: columnNumber = 1
Output: "A"
Example 2:
Input: columnNumber = 28
Output: "AB"
Example 3:
Input: columnNumber = 701
Output: "ZY"
*/ 
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder str = new StringBuilder();

        while(columnNumber > 0){
            // first adjust col no. to 0-indexing
            columnNumber--;
            int remainder = columnNumber % 26;
            char ch = (char) (remainder + 'A');
            str.insert(0, ch);
            columnNumber /= 26;
        }

        return str.toString();
    }
}
