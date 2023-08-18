class Laptop
{
	int cost;
	String brand;
	String name;
	Laptop(int a,String b,String c)
	{
		cost=a;
		brand=b;
		name=c;
	}
		public static void main(String [] args)
	{
			Laptop t=new Laptop(150000,"Lenovo","Ideapad");
			System.out.println(t.cost);
			System.out.println(t.brand);
			System.out.println(t.name);
	}
}