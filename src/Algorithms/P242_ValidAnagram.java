/*Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.
*/
package Algorithms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class P242_ValidAnagram {
	public static void main(String...args){
		System.out.println(isAnagram("qsffdfwerfw","qweresdffff"));
	}	
	
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++){
            if(hmap.containsKey(s.charAt(i))){
            	hmap.put(s.charAt(i), hmap.get(s.charAt(i)) + 1);
            }else{
            	hmap.put(s.charAt(i), 1);
            }           
        }
        
        for(int i=0; i<t.length(); i++){
            if(hmap.containsKey(t.charAt(i)))
                hmap.put(t.charAt(i), hmap.get(t.charAt(i)) - 1);
            else{
            	System.out.println(hmap.get(t.charAt(i)));
                return false;
                
            }
        }
        
        Iterator iterator  = hmap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            int value = (Integer)entry.getValue();
           
            if(value != 0) return false;
        }
                        
        return true;       
    }
}
