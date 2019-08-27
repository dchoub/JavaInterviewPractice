package dummy;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseOfNumber r= new ReverseOfNumber();
		r.reverseofNumber(1234);
		r.reverseString("dcpc");
		int a[] = {1,2,4,5,6};
		
		r.findMissingNumber( a , 6);
		
		int b[] = { 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 
                1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0 }; 

		
		r.sortBinaryArray(b);

	}
	
	
	
	public void reverseofNumber(int n) {
		int number =n;
		int result =0;
		int reminder;
		while(number!=0) {
		reminder = number%10;
		System.out.println("reminder is "+reminder);
		result= result*10 + reminder;
		System.out.println("results is "+result);
		number/=10;
		
		
	}
		System.out.println(result);
	}
	
	
	public void reverseString(String s) {
		StringBuffer reverse = new StringBuffer();
		
		for(int i =s.length()-1; i>=0; i--) {
			
			reverse = reverse.append(s.charAt(i));
			
		}
		System.out.println("reverse string is "+reverse);
	}
	
	
	
	public void findMissingNumber(int a [],int n) {
		int sum=0;
		int arraySum=0;
		int missingNumber;
		
		for(int i =1; i<=n; i++) {
			sum = sum+i;
		}
		
		for(int i =0; i<a.length; i++) {
			arraySum = arraySum+a[i];
		}
		
		missingNumber = sum-arraySum;
		
		System.out.println(missingNumber);
		
		
	}
	
	public void sortBinaryArray(int a[]) {
		if(a.length==1) {
			System.out.println("Already sorted");
		}
		int j =-1;
		int temp;
		for(int i =0; i<a.length; i++) {
			if(a[i]<1) {
				j++;
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				
				
			}
			
		}
		for(int i =0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		
		
	}

}
