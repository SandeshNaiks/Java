class Car
{
	int cost;
	String model;
	String type;
	Car(int a,String b,String c)
	{
		cost=a;
		model=b;
		type=c;
	}
		public static void main(String [] args)
	{
			Car c=new Car(15000000,"BMW","Petrol");
			System.out.println(c.cost);
			System.out.println(c.model);
			System.out.println(c.type);
	}
}