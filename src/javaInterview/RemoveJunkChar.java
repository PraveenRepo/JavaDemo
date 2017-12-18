package javaInterview;

public class RemoveJunkChar {
	public static void main(String[] args) {
		
		String s1="#&^%%$ Selenium )*(&^^%^&%$ learn &%%$$#^^* with &$%^$%^& Java";
		
		// Regular Exp [^a-zA-z0-9]
		
		s1=s1.replaceAll("[^a-z A-Z 0-9]", "");
		System.out.println(s1);
		
	}

}
