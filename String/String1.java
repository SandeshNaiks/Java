class String1
{
	static void reverse(String str)
	{
		String rev="";
		System.out.println(str);
		str=str.replaceAll(" ","");
		System.out.println(str);
		int num=str.length();

		for(int i=num-1;i>=0;i--)
		{	
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
}
class Rev2
{
	public static void main(String[] args)
	{
		String1.reverse("hello hey java");
	}
}