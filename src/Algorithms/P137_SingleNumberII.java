/*
 * 
 * 
 * Given an array of integers, every element appears three times except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

 * */
package Algorithms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class P137_SingleNumberII {
	
	public static void main(String...args){
		int[] arr = {1,1,1,2,2,2,3,3,3,4,4,4,5,5,6,6,6,7,7,7};
		int res = singleNumber(arr);
		System.out.println(res);
	}
	
	public static int singleNumber(int[] nums) {
		int res = 0;
        HashMap<Integer, Integer> myHash = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(myHash.containsKey(nums[i])){
                myHash.put(nums[i], myHash.get(nums[i]) + 1);
            }else{
                myHash.put(nums[i],1);
            }
        }
        
        Iterator iter = myHash.entrySet().iterator();
        while (iter.hasNext()) {
        	Map.Entry entry = (Map.Entry) iter.next();
        	Integer key = (Integer)entry.getKey();
        	Integer val = (Integer)entry.getValue();
        	if(val != 3) {
        		res = key;
        		break;
        	}
        }
        return res;
	 }
        
}
