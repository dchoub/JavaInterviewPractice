package dummy;

public class PalindromeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeProblem p = new PalindromeProblem();
		
		System.out.println(p.checkPalindrome("madam"));

	}
	
	
	public boolean checkPalindrome(String s) {
		int j =1;
		boolean result = false;
		
		for(int i =0; i<s.length(); i++) {
			int end = s.length()-j;
			j++;
			if(s.charAt(i)==s.charAt(end)) {
				result = true;
				
			}
			else {
				result = false;
				break;
			}
		}
		return result;
		
	}

}
