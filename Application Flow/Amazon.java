class Amazon
{
	static void signUp()
{
	System.out.println("signing up");
}
	static void order()
	{
	System.out.println("order product");
}
	static void logout()
	{
	System.out.println("logging out");
	}
	public static void main (String[] args)
	{
		signUp();
		login();
		homePage();
		order();
		logout();
	}
	static void login()
	{
	System.out.println("logging in");
	}
	static void homePage()
	{
	System.out.println("welcome to homepage");
	}
}