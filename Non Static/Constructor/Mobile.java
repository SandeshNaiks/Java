class Mobile
{
	int cost;
	String model;
	String colour;
	Mobile(int a,String b,String c)
	{
		cost=a;
		model=b;
		colour=c;
	}
		public static void main(String [] args)
	{
			Mobile m=new Mobile(15000,"Onplus","Black");
			System.out.println(m.cost);
			System.out.println(m.model);
			System.out.println(m.colour);
	}
}