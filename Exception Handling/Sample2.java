public class Sample2 {
	public static void main(String[] args) 
	{
		System.out.println("**MAIN STARTS*");
		try {
			int a=1/0;
		} catch (ArithmeticException e) {
			System.out.println("handled ");
		}
		
		System.out.println("***MAIN ENDS****");
	}

}