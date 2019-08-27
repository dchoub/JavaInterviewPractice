package dummy;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharaterCount {
	
	
	static char[] convertInCharacterArray(String s) {
		
		if(s.length()== 0 ) {
			System.out.println("emplty string");
		}
		
		char [] c = s.toCharArray();
		return c;
		
	}
	
	static int duplicateCount(char [] c) {
		HashMap <Character, Integer> check = new HashMap <Character, Integer>();
		int count =0;
		for (Character ch: c) {
			
			if(check.containsKey(ch)) {
				System.out.println("****"+ch);
			
			
				count++;
				check.put(ch, check.get(ch)+1);
				
			}
			else {
				check.put(ch, 1);
			}
	
		}
		Set<Character> keys = check.keySet();
		for(Character ch : keys) {
			
			if(check.get(ch)>1) {
				System.out.println(ch + "  is " + check.get(ch) + " times");
			}
		}
		return count;
		
		
	}
	
	static void printDuplicateCount(String s) {
		int count = duplicateCount(convertInCharacterArray(s));
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "dhwanid choubiiis";
		printDuplicateCount(s);

	}

}
