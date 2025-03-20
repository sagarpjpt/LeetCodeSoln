// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".
// Example 1:
// Input: strs = ["flower","flow","flight"]
// Output: "fl"

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];
        int count[] = new int[1];
        count[0] = Integer.MAX_VALUE;
        int flag[] = new int[1];
        int low = 0, high = strs.length-1;
        int mid = low + (high-low)/2;
        dac(strs, low, mid, count, flag);
        dac(strs, mid, high, count, flag);
        if(flag[0] == -1)
            return "";
        return strs[0].substring(0,count[0]);
    }

    private void dac(String[] strs, int l, int h, int c[], int f[]){

        if(l < h){
            if(h-l == 1){
                int s1 = strs[l].length();
                int s2 = strs[h].length();
                int range = s1 <= s2 ? s1 : s2;
                int temp = 0;
                if(s1 == 0 || s2 == 0 || strs[l].charAt(0) != strs[h].charAt(0)){
                    f[0] = -1;
                    return;
                }
                for(int i = 0; i<range;i++){
                    if(strs[l].charAt(i) == strs[h].charAt(i))
                        temp++;
                    else break;
                }
                c[0] = temp < c[0] ? temp : c[0];
            }
            else{
                int mid = l + (h - l) / 2;
                dac(strs, l, mid, c, f);
                dac(strs, mid, h, c, f);
            }
        }

    }
}
