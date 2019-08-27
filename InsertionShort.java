package dummy;

public class InsertionShort {
	static int a[] = {12,34,89,2,4,17,32};
	
	
	static void insertionShort(int a[]) {
		for(int i =0; i<a.length-1; i++) {
			int current = a[i];
			int j= i-1;
			while(j>=0 && a[j]> current) {
				a[j+1]= a[j];
				j--;
			}
			a[j+1]= current;
		}
		for(int b : a) {
			System.out.println(a);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertionShort(a);

	}

}
