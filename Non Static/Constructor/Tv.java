class Tv
{
	int cost;
	String brand;
	String type;
	Tv(int a,String b,String c)
	{
		cost=a;
		brand=b;
		type=c;
	}
		public static void main(String [] args)
	{
			Tv t=new Tv(15000,"Onida","LED");
			System.out.println(t.cost);
			System.out.println(t.brand);
			System.out.println(t.type);
	}
}