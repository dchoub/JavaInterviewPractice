package dummy;

public class SwitchType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchType s = new SwitchType();
		s.dummy(7,8,"add");

	}

	public  void dummy(int a, int b, String c) {
		int d;

		switch (c) {
		case "add":
			d = a + b;
			System.out.println("action is " +c +" and value of d is " +d);
			break;

		case "sub":
			d = a - b;
			System.out.println("action is " +c +" and value of d is " +d);
			break;
		case "mult":
			d = a * b;
			System.out.println("action is " +c +" and value of d is " +d);
			break;
		case "div":
			d = a / b;
			System.out.println("action is " +c +" and value of d is " +d);
			break;
		default:
			d = a + b;
			System.out.println("action does not match with any condition " +c +" and value of d is " +d);
			break;

		}
	}

}
