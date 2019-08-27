package dummy;

public class PalidromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PalidromeString p = new PalidromeString();
		System.out.println(p.checkPalidrome("abcba"));

	}
	
	public boolean checkPalidrome(String a) {
		
		String b = "";
		for(int i =a.length()-1; i>=0; i--) {
			b = b+a.charAt(i);
			
		}
		System.out.println(b);
		
		if(a.equals(b)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	


}
