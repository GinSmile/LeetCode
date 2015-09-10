package Algorithms;

import java.util.Hashtable;

public class P219_ContainsDuplicateII {
	    public boolean containsNearbyDuplicate(int[] nums, int k) {
	       Hashtable htable = new Hashtable();
	        for(int i=0; i<nums.length; i++){
	            if(htable.containsKey(nums[i])){
	                int diff = i - (Integer)htable.get(nums[i]);
	                if(diff > k){
	                    htable.put(nums[i],i);
	                    continue;
	                }
	                return true;
	            }else{
	                htable.put(nums[i],i);
	            }	            
	        }
	        return false;
	    }
}
