package dummy;

public class Outer {
	public int a;
	
	
	public void general() {
		int b;
		final int c=8;
	}
	 
	public class InnerClass{
		
		public void printvar() {
			a=5;

			System.out.println("Inner class ref is " + this);

			// Accessing outer class reference variable
			System.out.println("Outer class ref is " + Outer.this);
			
		}
		
	
	}
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer o = new Outer();
		
		Outer.InnerClass i = o.new InnerClass();
		i.printvar();
		

	}

}
