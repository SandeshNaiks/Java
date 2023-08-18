class Insta
{
	static void signUp()
{
	System.out.println("signing up");
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