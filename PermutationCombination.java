package dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;



public class PermutationCombination {
	
	Map<Integer, ArrayList<Integer>> pythogoroustriplet = new HashMap<Integer, ArrayList<Integer> >();
	
	
	static void printPermutation(String s,String ans) {
		
		if(s.length()==0)
		{
			System.out.println("permutations are " +ans +" " );
			return; 
			
		}
		
		
		for(int i =0; i<s.length(); i++) {
			char ch = s.charAt(i);
			//rest of letter
			String ros= s.substring(0,i)+s.substring(i+1);
			
			printPermutation(ros, ans+ch);
			
		}
	}
	

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//printPermutation("abcd", "");
		int ar[] = { 3, 1, 4, 6, 5 }; 
		PermutationCombination p = new PermutationCombination();
		p.findPhythogorus(ar);

	}
	
	public void findPhythogorus(int a []) {
		System.out.println("Hi");
		
		int count =0;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				for (int k=j+1; k<a.length; k++) {
					int x = a[i]*a[i];
					int y= a[j]*a[j];
					int z = a[k]*a[k];
					if(x==y+z || y==x+z || z==x+y) {
						count ++;
						ArrayList<Integer> b = new ArrayList<Integer>();
						b.add(a[i]);
						b.add(a[j]);
						b.add(a[k]);
						addInHashMap(count,b );
						
					}
					
				}
			}
		}

		
		
	}
	
	public void addInHashMap(int key,ArrayList a) {
		System.out.println("Hello");
		pythogoroustriplet.put(key, a);
		pythogoroustriplet.forEach((k,v)->{
			System.out.println(k + ":");
			printValues(v);
			
		});
		
	
		
	}
	
	public void printValues(ArrayList<Integer> a) {
		for (Integer p : a) {
			System.out.println(a);
		}
	}

}
