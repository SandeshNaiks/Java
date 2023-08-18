class Youtube
{
	void watch()
	{
		System.out.println("Watching Some Videos");
	}
}
class Studies extends Youtube
{
	void watch()
	{System.out.println("Watching Studies");
	}
}
class Movies extends Youtube
{
	void watch()
	{
		System.out.println("Watching Movies");
	}
}
class Technology extends Youtube
{
	void watch()
	{
		System.out.println("Watching Tech");
	}
}
class User
{
	static void access(Youtube t1)
	{
		t1.watch();
	}
}
class Youtube1
{
	public static void main(String[] arg)
	{
		Studies s1=new Studies();
		Movies m1=new Movies();
		Technology t1=new Technology();
		User.access(s1);
		User.access(m1);
		User.access(t1);
	}
}