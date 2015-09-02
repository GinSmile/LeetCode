/*
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
 */
package Algorithms;

import java.util.Arrays;

public class P169_MajorityElement {
	public static void main(String...args){
		int[] nums = {3,2,3,3,4,34,4,4,4,3,3,3,3,3};
		int target = majorityElement(nums);
		System.out.println(target);
	}
	
	
	//巧妙的方法，比一半还要多的数，在排序之后肯定会在中间！
	private static int majorityElement(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length/2];
	}



	//最笨的方法，找最多的数
    public static int majorityElementAnotherMethod(int[] nums) {
    	if(nums.length<2) return nums[0];
        Arrays.sort(nums);
        int maxNum = 1;//最大的数的个数
        int maxInt = nums[0];//最大的数
        int lastInt = nums[0];//上一个数
        int count = 1;
        for(int i=1; i<nums.length; i++){   	
            if(nums[i] == lastInt){
            	count++;
            }else{
            	if(count > maxNum){
            		maxNum = count;
            		maxInt = lastInt;
            	}
            	count = 1;
            	lastInt = nums[i];
            }
            
        }
        
        //防止最后一个是最多的
        if(count > maxNum){
    		maxInt = nums[nums.length-1];
    	}
        return maxInt;
    }
}