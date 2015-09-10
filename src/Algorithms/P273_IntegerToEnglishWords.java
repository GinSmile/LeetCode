
/*
 * Convert a non-negative integer to its english words representation. Given input is guaranteed to be less than 231 - 1.

For example,
123 -> "One Hundred Twenty Three"
12345 -> "Twelve Thousand Three Hundred Forty Five"
1234567 -> "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"

 * */

/*
 * 找规律，3个为一组，不断循环除1000得到的数，按照{"", "Thousand", "Million", "Billion"}的后缀标识。
 * */

package Algorithms;

public class P273_IntegerToEnglishWords {
	    private final static String[] lessThan20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
		private final static String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
		private final static String[] thousand = {"", "Thousand", "Million", "Billion"};
		
	    public String numberToWords(int num) {
	        if(num == 0) return "Zero";
			int index = 0;
			String res = "";
			while(num != 0){
				if(num % 1000 != 0)
					res = helper(num % 1000) + thousand[index] + " " + res;
				num = num / 1000;
				index++;
			}
			return res.trim();//去掉最后可能有的空格
	    }
	    
	    //less than 1000
		public static String helper(int num){
			if(num == 0){
				return "";
			}else if(num < 20){
				return lessThan20[num] + " ";			
			}else if(num < 100){
				return tens[num / 10] + " " + helper(num % 10);
			}else {
				return lessThan20[num / 100] + " Hundred " + helper(num % 100);
			}
		}
	}
