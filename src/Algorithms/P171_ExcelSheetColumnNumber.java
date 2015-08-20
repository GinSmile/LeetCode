package Algorithms;
/*Related to question Excel Sheet Column Title

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
    
    
    26的n次方，很简单的数学问题！
    
    比如：AAC
    就是 26^2 * 1 + 26 * 1 + 3
*/
public class P171_ExcelSheetColumnNumber {
	public static void main(String...args){
		System.out.println(titleToNumber("AAC"));
	}
	
    public static int titleToNumber(String s) {
        char[] colStr= s.toCharArray();
        
        int res = 0;
        for(int i=colStr.length-1; i>=0; i--){
        	res += (colStr[i] - 'A' + 1) * (Math.pow(26, colStr.length - 1 - i));
        }
        return res;
    }
}
