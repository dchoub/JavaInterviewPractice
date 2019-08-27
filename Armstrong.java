package dummy;

public class Armstrong {
	static int number =320;
	static int originalNumber, result=0, remainder;
	
	
	public static void checkArmstrong() {
		originalNumber =number;
		
		while(originalNumber!=0) {
			remainder=originalNumber%10;
			result += Math.pow(remainder,3);
			originalNumber /=10;
			
			
		}
		
		if(result==number) {
			
			System.out.println("yes" +result);
		}
		else System.out.println("nope");
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkArmstrong();
		

	}

}
