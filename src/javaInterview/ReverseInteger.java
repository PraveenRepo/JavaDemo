package javaInterview;

public class ReverseInteger {

	public static void main(String[] args) {
		
		// 1. Using Algo
		
		long num=123456789l;
		long rev=0l;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}

		System.out.println("Reverse number is : "+rev);
		
		// 2. Using StringBuffer Object
		
		int num1=12345;
		
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
	}

}
