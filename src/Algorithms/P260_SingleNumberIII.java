/*
 * 
 * 
Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

For example:

Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].

Note:
The order of the result is not important. So in the above example, [5, 3] is also correct.
Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?

 * */
package Algorithms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class P260_SingleNumberIII {
	
	public static void main(String...args){
		int[] arr = {1, 2, 1, 3, 2, 5};
		int res[] = singleNumber(arr);
		System.out.println(res[0]);
		System.out.println(res[1]);
	}
	
	public static int[] singleNumber(int[] nums) {
		int[] res = {0, 0};
        HashMap<Integer, Integer> myHash = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(myHash.containsKey(nums[i])){
                myHash.put(nums[i], myHash.get(nums[i]) + 1);
            }else{
                myHash.put(nums[i],1);
            }
        }
        
        Iterator iter = myHash.entrySet().iterator();
        int count = 0;
        while (iter.hasNext() && count < 2) {
        	Map.Entry entry = (Map.Entry) iter.next();
        	Integer key = (Integer)entry.getKey();
        	Integer val = (Integer)entry.getValue();
        	if(val != 2) {
        		res[count] = key;
        		count++;
        	}
        }
        return res;
	 }
        
}
