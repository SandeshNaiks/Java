class Home
{
	int cost;
	String colour;
	String name;
	Home(int a,String b,String c)
	{
		cost=a;
		colour=b;
		name=c;
	}
		public static void main(String [] args)
	{
			Home h=new Home(15000000,"White","Shrinidhi Nilaya");
			System.out.println(h.cost);
			System.out.println(h.colour);
			System.out.println(h.name);
	}
}