class Sample
{
	public static void main(String[] args)
	{
		System.out.println("***** Main Starts*****");
		try
		{
			int s=1/0;
		}
		catch (ArithmeticException e)
		{
			System.out.println("Handled");
		}
		System.out.println("***** Main Ends*****");
	}
}