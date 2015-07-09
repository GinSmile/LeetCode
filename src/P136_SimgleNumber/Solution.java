/*
Given an array of integers, every element appears twice except for one. Find that single one.
Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * 
 * */

package P136_SimgleNumber;

public class Solution {
    public int singleNumber(int[] nums) {
        //use XOR
        int ans = 0;
        for(int num : nums){
            ans = ans^num;
        }
        return ans;
    }
}
