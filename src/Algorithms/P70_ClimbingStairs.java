/*You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

*/


/*
 * 
 * 就是斐波那契函数。
 * 
 * */


package Algorithms;

public class P70_ClimbingStairs {
	    public int climbStairs(int n) {
	        if(n < 3) return n;
	        int[] myArr = new int[n+1];
	        myArr[0] = 0;
	        myArr[1] = 1;
	        myArr[2] = 2;
	        for(int i = 3; i < n + 1; i++){
	            myArr[i] = myArr[i-1] + myArr[i-2];
	        }
	        return myArr[n];
	    }
	}