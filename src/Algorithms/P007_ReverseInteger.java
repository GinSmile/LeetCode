/*
 * Reverse digits of an integer.
 *   Example1: x = 123, return 321
 *   Example2: x = -123, return -321
*/
package Algorithms;

public class P007_ReverseInteger {
	public int reverse(int x) {
        long res = 0; //注意超出int范围的时候，overflow
        while(x != 0){
            res = res * 10 + (x%10);
            x = x/10;
        }
        if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
        return (int)res;
        
    }
}
