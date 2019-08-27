package dummy;

public class LearningToString {
	
	private String name;
	private String dob;
	public LearningToString(String name, String dob) {
		this.name=name;
		this.dob=dob;
	}
	
	public String toString() {
		return name +"," +dob;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearningToString first = new LearningToString("dc", "24Jan1990");
		LearningToString second = new LearningToString("ankur", "08June1989");
		
		System.out.println(first.toString());
		System.out.println(first.name);

	}

}
