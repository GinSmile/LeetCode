package Algorithms;
/*Write a program to check whether a given number is an ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.

Note that 1 is typically treated as an ugly number.

*只有2，3，5之间相互乘得到的数才可以。所以就不断出除～
*/
public class P263_UglyNumber {
    public boolean isUgly(int num) {
        if(num <= 0) return false;
        
        while(num % 2 == 0) num /= 2;
        while(num % 3 == 0) num /= 3;
        while(num % 5 == 0) num /= 5;
        
        return num == 1;
    }
}