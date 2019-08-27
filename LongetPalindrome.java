package dummy;

public class LongetPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(longestPalindromeString("ABABBACBAABC"));

	}
	
	static public String intermediatePalindrome(String s, int left, int right) {
		if (left > right) return null;
		while (left >= 0 && right < s.length()
				&& s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return s.substring(left + 1, right);
	}
	
	
	public static String longestPalindromeString(String s) {
		
	if(s==null) return null;
	String longest = s.substring(0,1);
	System.out.println("my first longest is " +longest);
	for(int i=0; i<s.length()-1; i++) {
		String plindrome = intermediatePalindrome(s, i, i);
		if(plindrome.length()>longest.length()) {
			longest= plindrome;
		}
	 plindrome = intermediatePalindrome(s, i, i+1);
		if(plindrome.length()>longest.length()) {
			longest= plindrome;
		}
			
		
	}
		return longest;
	}
	}


