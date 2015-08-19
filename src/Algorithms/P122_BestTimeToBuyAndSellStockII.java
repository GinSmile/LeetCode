package Algorithms;
/*
 * Say you have an array for which the ith element is the price of a given stock on day i.

   Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).

*
*
*  用贪婪的方法，把所有上升区间都加起来。
*/
public class P122_BestTimeToBuyAndSellStockII {
	    public int maxProfit(int[] prices) {
	        int profile = 0;
	        for(int i=0; i<prices.length-1; i++){
	            if(prices[i] < prices[i+1]){
	                profile += prices[i+1] - prices[i];
	            }
	        }
	        return profile;
	    }
}
