package dummy;

import java.util.regex.Pattern;

public class ReverseWordsInString {
	
	static String reverseWords(String s) {
		
		Pattern pattern = Pattern.compile("\\s");
		String [] temp = pattern.split(s);
		String result = "";
		for(int i =0; i<temp.length; i++) {
			
			String newTemp = temp[i];
			StringBuffer str = new StringBuffer();
		
			for(int j =newTemp.length()-1; j>=0; j--) {
				str.append(newTemp.charAt(j));
				
				
			}
			//System.out.println("*****" +str);
			result = " "+str +result;
			
		}
		return result;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWords("hi my name is Dhwani"));
		

	}

}
