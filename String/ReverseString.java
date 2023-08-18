class Change
{
	static void rev(String s1)
	{
		String rev="";
		int num=s1.length();
		for(int i=num-1;i>=0;i--)
		{
		rev=rev+s1.charAt(i);
		}
		System.out.println("the string in rev is  :"+rev);
	}
}
class ReverseString
{
	public static void main(String[] args)
	{
		Change.rev("Narendhar");
	}
}