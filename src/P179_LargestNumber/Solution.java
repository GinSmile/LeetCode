/*
 * 
Given a list of non negative integers, arrange them such that they form the largest number.

For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.

Note: The result may be very large, so you need to return a string instead of an integer.

Credits:
Special thanks to @ts for adding this problem and creating all test cases.


这道题的思路就是重写compare函数，规定两个字符串之间的大小。
 * */

package P179_LargestNumber;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
	public static void main(String...args){
		int[] nums = {0,0};
		String resString = largestNumber(nums);
		System.out.print(resString);
	}
	public static String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for(int i=0; i<nums.length; i++){
        	arr[i] = String.valueOf(nums[i]);
        }
       
        Comparator myCom = new MyComparator();
        Arrays.sort(arr,myCom);//从小到大排列，这里的大小必须重新定义
        
        String reString="";
        for(int i=0; i<nums.length; i++){
        	reString += arr[i];
        }
        if(arr[0].equals("0")) return "0";//注意特殊情况
        return reString;
    }
	
	static class MyComparator implements Comparator<String>{
		//重写compare函数，让最终的结果为9排在前面,注意这里！9是最小的，0是最大的
		//返回1代表o1>o2，比如0>999
		//返回-1代表o1<o2
		@Override
		public int compare(String o1, String o2) {
			//把字符串转换为整形数组
			char[] c1 = o1.toCharArray();
			char[] c2= o2.toCharArray();
			int[] d1 = new int[c1.length];
			int[] d2 = new int[c2.length];
			for(int i=0; i<c1.length; i++){
				d1[i] = c1[i] - '0';
			}
			for(int i=0; i<c2.length; i++){
				d2[i] = c2[i] - '0';
			}
			
			
			//比较大小
			/*
			 * 大小规定为：
			 * 1>2>3>...>9
			 * 53>5
			 * 55==5，53==53535353
			 * 56<5
			 * 
			 * 即：
			 * 比较第一个，如果数值上d1[i] > d2[i] ,说明d1要排在前面，返回-1
			 * 
			 * */
	        int i = 0;
	        int j = 0;
	        int loop1 = 0;
	        int loop2 = 0;
	        while(loop1 < 2 || loop2 < 2){
	            if(d1[i] > d2[j]){
	                return -1;
	            }else if(d1[i] < d2[j]){
	                return 1;
	            }
	            
	            if(i != d1.length - 1){
	                i++;
	            }else{
	                i = 0;//如果d1为最后一个数，那么i赋0，因为5353==53535353
	                loop1++;
	            }
	            
	            if(j != d2.length - 1){
	                j++;
	            }else{
	                j = 0;
	                loop2++;
	            }
	        }
	        return 0;
		}
		
	}
	


}
