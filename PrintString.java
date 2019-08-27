package dummy;

public class PrintString {
	
	
	static void printStringAsSuggested(String s, char ch, int count ) {
		int newCount=0;
		
		 if (count == 0) { 
	            System.out.println(s); 
	            return; 
	        } 
		for(int i =0; i<s.length(); i++) {
			if(s.charAt(i)==ch) {
				newCount++;
				if(newCount==count) {
					System.out.println(s.substring(i+1));
				}
			}
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geeks for geeks"; 
		printStringAsSuggested(str, 'g', 2); 

	}
	
	

}
