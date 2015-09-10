/*
 * Given a sorted integer array without duplicates, return the summary of its ranges.

For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 * 
 * */
package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class P228_SummaryRanges {
	public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<String>();
        if(nums.length < 1) return list;
        int last = nums[0];
        int first = nums[0];
        

        for(int i = 1; i < nums.length; i++){
            //如果不连续
            if(nums[i] != last + 1){
                if(last == first) list.add(last + "");
                else list.add(first + "->" + last);
                first = nums[i];
            }
            
            last = nums[i];

        }
        
        //最后一个数的情况
        if(first == last) list.add(last + "");
        else list.add(first + "->" + last);
        
        return list;
    }
}
