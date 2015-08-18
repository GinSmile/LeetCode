package Algorithms;

/*
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?
*/


public class P258_AddDigits {
	public static void main(String...args){
		int num = 38;
		int result = addDigits(num);
		System.out.println(result);
	}
	
	
	//最基础的方法
	public static int addDigits(int num){
		if(num < 10){
			return num;	
		}
			
		int res = 0;//将num从个位数加到头的结果
		while(num > 9){//第一层循环，如果结果比9大，那么继续从最后一个数开始加
			res = 0;
			while(true){
				res += num%10;
				num = num/10;		
				if(num == 0) break;
			}
			num = res;
		}
		
		return res;
	}
	
	
	
	//也可以找规律，发现数学公式
	/*
	
	最终的结果必定是0，1，2，...，9只中的一个，然后发现
	
	num,result
	0,0

	1,1
	2,2
	...
	9,9

	10,1
	11,2
	...
	18,9

	19,1
	20,2
	...
	27,9
	...
	
	由此可见，该变换是循环的，以9为周期，因而有一下公式
	
	result = 0 when num = 0
	result = (num-1)%9 + 1 when num != 0
	 */
	public static int addDigits2(int num){
		return num == 0 ? 0:((num - 1) % 9 + 1);
	}
}
