package duplicateString;

import java.util.LinkedHashSet;

public class StringDuplicatesDemo {
	
	public static void main(String []args) {
		String str= "programming";
		 
		LinkedHashSet<Character>set = new LinkedHashSet();
		for( int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		for(Character c: set) {
			System.out.print(c);			
		}	
	
	}
}
