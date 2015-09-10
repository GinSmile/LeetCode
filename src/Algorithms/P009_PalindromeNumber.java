/*
 * 
 * Determine whether an integer is a palindrome. Do this without extra space.
 * */
package Algorithms;

public class P009_PalindromeNumber {
	 public boolean isPalindrome(int x) {
	        if(x >= 0 && x <= 9) return true;
	        if(x < 0 || x % 10 == 0) return false;
	        
	        //利用取反的思路，直到把1221分成rev = 12, x = 12。
	        //或者把121分成rev = 12, x = 1
	        long rev = 0;
	        while(x != 0){
	            rev = rev * 10 + x % 10;
	            x = x / 10;
	            if(x == rev || x == rev / 10) return true;//1221,121两种情况
	        }
	        return false;
	  }
}
