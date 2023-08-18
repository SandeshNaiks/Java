class Cloth
{
	int cost;
	String colour;
	String size;
	Cloth(int a,String b,String c)
	{
		cost=a;
		colour=b;
		size=c;
	}
		public static void main(String [] args)
	{
			Cloth c=new Cloth(1500,"White","L,XL,M");
			System.out.println(c.cost);
			System.out.println(c.colour);
			System.out.println(c.size);
	}
}