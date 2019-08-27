package dummy;

public class AnagramProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnagramProblem ap = new AnagramProblem();
		System.out.println(ap.checkAnagram("restful", "fluster"));
	}
	
	
	public boolean checkAnagram(String s, String a) {
		boolean isAnagram = false;
		
		if (s.length()!=a.length()) {
			return false;
			
		}
		for(int i =0; i<s.length(); i++) {
		char letter = s.charAt(i);
		
		if(!a.contains(Character.toString(letter))) {
			isAnagram = false;
			
			
		}
		else {
			isAnagram = true;
		}
	
		
			
		}
		return isAnagram;
	}

}
