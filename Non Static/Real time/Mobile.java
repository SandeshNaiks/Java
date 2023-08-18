class Mobile
{
	int cost;
	static String model="Oneplus";
	String colour;
	public static void main(String [] args)
	{
		System.out.println(" Mobile model name: "+ model);
		Mobile m1=new Mobile();
		m1.cost=29000;
		System.out.println("Cost of the mobile: "+ m1.cost);
		Mobile m2=new Mobile();
		m2.colour="Black";
		System.out.println("Colour of the mobile: "+ m2.colour);
	}
}