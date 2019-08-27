package dummy;

import java.util.HashMap;

public class DuplicateArrays {
	
	static Integer a []= {1,2,3,4,56,1,2,3};
	static int b[]=  {1,2,3,1,3,4,4};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateArrays d = new DuplicateArrays();
		d.saveInMap(a);
		d.checkDuplicates(b);
		
		
		

	}
	
	
	public void saveInMap(Integer[] a2) {
		HashMap<Integer,String> dummy = new HashMap<Integer,String>();
		Integer b[] = new Integer [a2.length];
		int j =0;
	
		for (int i =0; i<a2.length; i++) {
			if(!dummy.containsKey(a2[i])) {
				dummy.put(a2[i], "array numbers");
				
				
			}
			else {
				b[j]=a2[i];
				j++;
				
				System.out.println("No duplicates");
			}
			
		}
		
		dummy.forEach((k, v) -> {
			
			System.out.println(k);

		});
		
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		
		
	}
	
	
	
	public void checkDuplicates(int a[]) {
		for(int i=0;i<a.length; i++) {
			if(a[Math.abs(a[i])] >0) {
				a[Math.abs(a[i])] = - a[Math.abs(a[i])]	;
				
			}
			else {
				System.out.println("value is duplicate " +Math.abs(a[i]));
			}
		}
	}

}
