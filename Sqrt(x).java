/*
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
*/ 
class Solution {
    public int mySqrt(int x) {
        // sqrt(x) = y ----> x = y^2; here y is mid
        int low = 0, high = x, mid = 0;
        int res = 0;
        while(low <= high) {
            mid = low + (high - low) / 2;
            if((long)mid * mid == x) return mid;
            else if((long)mid * mid < x){
                low = mid + 1;
                res = mid; //stores the last mid for which mid^2 < x
            }
            else high = mid -1;
        }
        return res;
    }
}
