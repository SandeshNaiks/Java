class Sample
{
	public static void main(String[] args)
	{
		String str1="Hey";
		String str2="Bye";
		System.out.println(str1==str2);
		System.out.println("**********");
		String str3=new String("Hey Buddy");
		String str4=new String("Hey Buddy");
		System.out.println(str3.equals(str4));
	}
}