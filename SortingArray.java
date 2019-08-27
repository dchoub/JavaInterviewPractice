package dummy;

public class SortingArray {

	static int a[] = new int[] { 23, 34, 13, 64, 72, 90, 10, 15, 9, 27 };
	static int max = a[0];
	static int min = a[0];

	static int findmax(int a[]) {
		
		for(int i =0; i<a.length; i++) {
			if(max<a[i]) {
				max = a[i];
			}
		}
		return max;
		
		
	}
	static int findmin(int a[]) {
		
		for(int i =0; i<a.length; i++) {
			if(min>a[i]) {
				min = a[i];
			}
		}
		return min;
		
		
	}
	
	static void sortArray(int a[]) {
		//selection sort
		
		for(int i =0; i<a.length-2; i++) {
		int  minIndex = i;
		for (int j=i+1; j<a.length-1; j++) {
			if (a[j]<a[minIndex]) {
				minIndex=j;
			}
		}
		
		int temp = a[minIndex];
		a[minIndex] = a[i];
		a[i] = temp;
		}
		
		for(int b: a) {
			System.out.println(b);
		}
	}
	
	
	static void insetionSort(int a[]) {
		//insertion sort
		for(int i =0; i<a.length-1;i++) {
			int current = a[i];
			int j =i-1;
			
			while(j>=0 && a[j]>current) {
				a[j+1] =a[j];
				j=j-1;
			}
			a[j+1] = current;
			
		}
		for(int b: a) {
			System.out.println(b);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findmax(a));
		System.out.println(findmin(a));
		/*System.out.println("***********");
		sortArray(a);*/
		System.out.println("***********");
		insetionSort(a);

	}

}
