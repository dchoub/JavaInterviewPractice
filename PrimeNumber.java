package dummy;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       PrimeNumber p = new PrimeNumber();
       p.printPrime();
	}
	
	
	public boolean checkPrime(int num) {
		//check if number is 0 or 1
		if(num ==0 || num ==1) {
			return false;
		}
		//check if number is 2 or 3
		if(num == 2 || num ==3) {
			return true;
		}
		//check if number is divisible by 2
		if(num % 2 ==0) {
			return false;
		}
		if((num * num - 1) % 24 == 0) {
			return true;
		}
		else {
		return false;
		}
		
		
		
		//check if 
	}
	
	
	public void printPrime() {
		
		for(int i=1; i<=100; i++) {
			if(checkPrime(i)) {
				System.out.println(i);
			}
		}
		
	}

}
