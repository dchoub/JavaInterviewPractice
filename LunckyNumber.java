package dummy;

public class LunckyNumber {
	static int counter = 2;
	
	static boolean checkLuckyNumber(int n) {
		
		if(n%counter==0) return false;
		
		if(counter>n) return true;
		
		n = n- n/counter;
		counter++;
		return checkLuckyNumber(n);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(checkLuckyNumber(27));

	}

}
