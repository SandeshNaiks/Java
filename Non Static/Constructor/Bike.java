class Bike
{
	int cost;
	String brand;
	String colour;
	Bike(int a,String b,String c)
	{
		cost=a;
		brand=b;
		colour=c;
	}
		public static void main(String [] args)
	{
			Bike b=new Bike(150000,"Duke","Black");
			System.out.println(b.cost);
			System.out.println(b.brand);
			System.out.println(b.colour);
	}
}