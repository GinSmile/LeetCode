package Algorithms;

/*
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 


 * */
public class P168_ExcelSheetColumnTitle {
	public static void main(String...args){
		System.out.println(titleToNumber("AZ"));
		System.out.println(convertToTitle(705));
	}
	
    public static int titleToNumber(String s) {
        char[] colStr= s.toCharArray();
        
        int res = 0;
        for(int i=colStr.length-1; i>=0; i--){
        	res += (colStr[i] - 'A' + 1) * (Math.pow(26, colStr.length - 1 - i));
        }
        return res;
    }
    
    public static String convertToTitle(int n) {
        String resString = "";
        char curChar = 'a';
        while(!(n/26 == 0 && n%26 == 0)){
        	//26为一个循环
        	curChar= (char)((n - 1) % 26 + 'A');
        	resString =  curChar + resString;
        	n = (n-1)/26;
        }
        
        return resString;
    }
    
    
}
