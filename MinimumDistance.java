package dummy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimumDistance {
	
	public int findMinimumDistance(int arr[], int x, int y) {
		int mind= Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if((x==arr[i]&& y== arr[j] || y==arr[i]&&x==arr[j])&& mind>Math.abs(i-j)) {
					mind= Math.abs(i-j);
				}
					
			}
			
		}
		return mind;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length of array");
		int num = Integer.parseInt(bf.readLine());
		
		System.out.println("Enter the number now");
		String s = bf.readLine();
		int arr[] = new int [num];
		String[] s1 = s.split(" ");
		for(int i =0; i<num; i++) {
			arr[i]= Integer.parseInt(s1[i]);
		}
		
		for(int i =0; i<num; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Enter the first element");
		int x = Integer.parseInt(bf.readLine());

		System.out.println("Enter the second element");
		int y = Integer.parseInt(bf.readLine());
		
		MinimumDistance d= new MinimumDistance();
		
		 int mind = d.findMinimumDistance(arr, x,y);
		 System.out.println(mind);
		
		
		
		
		
		

	}

}
