/*
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.

Hide Tags
 */
package P26_RemoveDuplicatesFromSortedArray;

public class Solution {
    public static int removeDuplicates(int[] nums) {
		if(nums.length == 0) return 0;
        int front = nums[0];
        int count = 1;

        //make sure that the top n numbers is unique,n equals count
        for(int i=1; i<nums.length; i++){
            if(nums[i] != front){
                front = nums[i];
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
