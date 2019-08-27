package dummy;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FibonacciSeries f = new FibonacciSeries();
		f.getFibonacci(10);

	}
	
	
	public void getFibonacci(int num) {
		int a = 0;
		int b= 1;
		int c;
		System.out.println(a);
		System.out.println(b);
		
		try {
		for(int i =3; i<=num; i++ ) {
			c= a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
				
		
	}

}
