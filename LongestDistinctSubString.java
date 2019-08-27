package dummy;

import java.util.LinkedHashSet;

public class LongestDistinctSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestSubString("abcdcefaklb"));

	}
	
	
	public static int longestSubString(String s) {
		int result=1;
		
		if(s==null || s.length()==0) return 0;
		LinkedHashSet<Character> temp = new LinkedHashSet();
		int j=0;
		for(int i=0;i<s.length();i++) {
			if(!temp.contains(s.charAt(i))) {
				temp.add(s.charAt(i));
				result= Math.max(result, temp.size());
								
			}
			else {
				while(j<i) {
					if(s.charAt(j)== s.charAt(i)) {
						
						j++;
						break;
					}
					temp.remove(s.charAt(j));
					j++;
				}
			}
		}
		
		for(Character ch: temp) {
			System.out.println(ch);
			
		}
		return result;
		
		
		
		
	}

}
