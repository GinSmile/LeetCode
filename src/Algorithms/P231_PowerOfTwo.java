/*
 * Given an integer, write a function to determine if it is a power of two.
*/

package Algorithms;

public class P231_PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        //bit
    	if(((n-1)&n) == 0 && n > 0) return true;
    	return false;
  }
}
