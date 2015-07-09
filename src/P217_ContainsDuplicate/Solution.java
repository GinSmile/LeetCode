/*
Given an array of integers, find if the array contains any duplicates. 
Your function should return true if any value appears at least twice in the array, 
and it should return false if every element is distinct.
*/
package P217_ContainsDuplicate;

import java.util.Hashtable;

public class Solution {
    public static boolean containsDuplicate(int[] nums) {
        Hashtable<Integer,Integer> htable = new Hashtable<Integer,Integer>();
        for(int i=0; i<nums.length; i++){
            if(htable.containsKey(nums[i])){
                return true;
            }else{
                htable.put(Integer.valueOf(nums[i]),Integer.valueOf(1));
            }
            
        }
        return false;
    }
    
    public static void main(String...args){
    	int[] nums = {1,2,3,4,5,3,4,23,23};
    	System.out.println(containsDuplicate(nums));
    }
}