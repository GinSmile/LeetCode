/*
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */

package Algorithms;

public class P027_RemoveElement {
	    public int removeElement(int[] nums, int val) {
			 //先排序，再找到第一个需要除掉的，以及值为val的总长度
			 sort(nums);
			 int count = 0;
			 int firstIndex = 0;
			 boolean isFirst = true;
			 for(int i = 0; i<nums.length;i++){		 
				 if(nums[i] == val){
					 if(isFirst){
					     firstIndex = i;
					     isFirst = false;
					 } 
					 count++;
				 }
			 }
			 
			 //依次除掉值为val的
			 for(int i = firstIndex; i+count < nums.length; i++){
				 nums[i] = nums[i+count];
			 }
			 
			 return nums.length - count;
		 }
		 
		public void sort(int[] nums){
			 if(nums.length < 2) return;
			 //插入排序
			 for(int i=1; i<nums.length; i++){
				 int firstUnsortedNum = nums[i];
				 int j = i-1;
				 while(j>=0 && firstUnsortedNum < nums[j]){
					 nums[j+1] = nums[j];
					 j--;
				 }
				 nums[j+1] = firstUnsortedNum;
			 }
		 }
		
		
		
		//在别处看到的更简单聪明的做法如下,利用shift变量，不断往后扫描，只要不是和val相等的就复制到当前位置。
		/*
		public int removeElement(int[] nums, int val) {
		    int shift = 0;
		    for(int i  = 0; i < nums.length; i++){
		       while(nums[i+shift] == val){
		         shift++;
		       }
		       if(i+shift < nums.length){
		          nums[i] = nums[i+shift];//复制到当前位置
		       }
		    }
		    return nums.length - shift;
		}
		*/
}
	 
