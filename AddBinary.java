/*
Given two binary strings a and b, return their sum as a binary string.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
*/

class Solution {
    public String addBinary(String a, String b) {

        int i = a.length()-1, j = b.length()-1;
        int carryIn = 0, sum = 0;
        int x = 0, y = 0;
        String res = "";
        while(i >= 0  || j >= 0){
            if(i >= 0)  x = a.charAt(i) - '0'; else x = 0;
            if(j >= 0)  y = b.charAt(j) - '0'; else y = 0;
            sum = x ^ y ^ carryIn;
            res += sum;
            carryIn = (x & y) | (y & carryIn) | (x & carryIn);
            i--;j--;
        }
        if(carryIn == 1)    res += carryIn;
        return new StringBuilder(res).reverse().toString();

        // method 2 
        // StringBuilder result = new StringBuilder();
        // int i = a.length() - 1, j = b.length() - 1, carry = 0;

        // while (i >= 0 || j >= 0 || carry > 0) {
        //     int sum = carry;
        //     if (i >= 0) sum += a.charAt(i--) - '0'; // Convert char to int
        //     if (j >= 0) sum += b.charAt(j--) - '0'; 

        //     result.append(sum % 2); // Append the remainder (0 or 1)
        //     carry = sum / 2; // Calculate carry (1 if sum is 2 or 3, else 0)
        // }

        // return result.reverse().toString();
    }
}
